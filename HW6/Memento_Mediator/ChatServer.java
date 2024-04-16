package HW6.Memento_Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private List<User> registeredUsers;
    private Map<String, Map<String, ChatHistory>> chatHistories;
    private Map<String, List<String>> blockedUsers;

    public ChatServer() {
        registeredUsers = new ArrayList<>();
        chatHistories = new HashMap<>();
        blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
        chatHistories.put(user.getName(), new HashMap<>());
        blockedUsers.put(user.getName(), new ArrayList<>());
    }

    public void unregisterUser(User user) {
        registeredUsers.remove(user);
        chatHistories.remove(user.getName());
        blockedUsers.remove(user.getName());
    }

    public void relayMessage(Message messageContent) {
        String senderName = messageContent.getSender();
        User sender = getUserByName(senderName);
        List<String> recipientNames = messageContent.getRecipients();

        if (!isSenderRegistered(sender)) {
            System.out.println("Sender is not registered.");
            return;
        }

        for (String recipientName : recipientNames) {
            User recipient = getUserByName(recipientName);

            if (recipient != null) {
                if (isUserBlocked(sender, recipient)) {
                    System.out.println(recipientName + " blocked " + senderName);
                }
                else {
                    updateChatHistoryMap(senderName, recipientName, messageContent);
                    updateChatHistoryMap(recipientName, senderName, messageContent);

                    recipient.receiveMessage(messageContent);
                }
            }
            else {
                System.out.println("Recipient " + recipientName + " not found.");
            }
        }
    }

    public void updateChatHistoryMap(String userName, String otherName, Message messageContent) {
        ChatHistory chatHistory = getOrCreateChatHistory(userName, otherName);
        chatHistory.addMessage(messageContent);
        Map<String, ChatHistory> userChatHistories = chatHistories.getOrDefault(userName, new HashMap<>());

        userChatHistories.put(otherName, chatHistory);
        chatHistories.put(userName, userChatHistories);
    }


    private ChatHistory getOrCreateChatHistory(String senderName, String recipientName) {
        Map<String, ChatHistory> senderChatHistories = chatHistories.getOrDefault(senderName, new HashMap<>());
        ChatHistory senderChatHistory = senderChatHistories.computeIfAbsent(recipientName, k -> new ChatHistory());
        chatHistories.put(senderName, senderChatHistories);

        return senderChatHistory;
    }

    public void undoLastMessage(User user, String otherUser) {
        Map<String, ChatHistory> userChatHistories = chatHistories.get(user.getName());

        if (userChatHistories != null) {
            ChatHistory chatHistory = userChatHistories.get(otherUser);

            if (chatHistory != null) {
                chatHistory.removeLastMessage(chatHistory.getMemento());
            }

            for (Map<String, ChatHistory> chatHistories : chatHistories.values()) {
                ChatHistory otherUserHistory = chatHistories.get(user.getName());
                if (otherUserHistory != null) {
                    otherUserHistory.removeLastMessage(otherUserHistory.getMemento());
                }
            }
        }
    }

    public void blockUser(String blocker, String userToBlock) {
        List<String> blocked = blockedUsers.getOrDefault(blocker, new ArrayList<>());
        blocked.add(userToBlock);
        blockedUsers.put(blocker, blocked);
    }

    private User getUserByName(String userName) {
        for (User user : registeredUsers) {
            if (user.getName().equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public void viewChatHistoryWithUser(String userName, String otherUser) {
        User user = getUserByName(userName);
        User recipient = getUserByName(otherUser);

        if (user == null) {
            System.out.println("User " + userName + " not found.");
            return;
        }

        if (recipient == null) {
            System.out.println("User " + otherUser + " not found.");
            return;
        }

        ChatHistory chatHistory = getChatHistoryForUser(userName, otherUser);
        if (chatHistory == null) {
            System.out.println("No chat history found for user " + otherUser + ".");
        }
        else {
            System.out.println("Chat history with " + otherUser + ":");
            chatHistory.printChatHistory(userName);
        }
    }

    public ChatHistory getChatHistoryForUser(String senderName, String recipientName) {
        Map<String, ChatHistory> userChatHistories = chatHistories.get(senderName);
        if (userChatHistories != null) {
            return userChatHistories.get(recipientName);
        }
        return null;
    }

    private boolean isUserBlocked(User sender, User recipient) {
        List<String> blocked = blockedUsers.getOrDefault(recipient.getName(), new ArrayList<>());
        return blocked.contains(sender.getName());
    }

    private boolean isSenderRegistered(User user) {
        return registeredUsers.contains(user);
    }

    public List<User> getRegisteredUsers() {
        return registeredUsers;
    }
}
