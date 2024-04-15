package HW6.Memento_Mediator;
import java.util.ArrayList;
import java.time.LocalDateTime;

import java.util.Iterator;
import java.util.Stack;

public class User implements IterableByUser{
    private String name;
    private ArrayList<String> blocked = new ArrayList<>();
    private Stack<MessageMemento> messageHistory = new Stack<>();
    private Message userMessage = new Message();
    private ChatServer server;
    private ChatHistory chatHistory;
    public User(String name, ChatServer server) {
        this.name = name;
        this.server = server;
    }

    public void writeMessage(String messageContent, ArrayList<String> recipients){
        userMessage.setMessageContent(messageContent);
        userMessage.setRecipients(recipients);
        userMessage.setSender(this.name);

        String timestamp = String.valueOf(LocalDateTime.now());
        userMessage.setTimestamp(timestamp);
    }

    public void sendMessage() {
        server.relayMessage(userMessage);
        messageHistory.push(new MessageMemento(userMessage));
    }

    public void saveMessage(){
        messageHistory.push(new MessageMemento(userMessage));
    }

    public void receiveMessage(Message message) {
        System.out.println("[" + message.getTimestamp() + "] " + message.getSender() + ": " + message.getMessageContent());
    }

    public void undoLastMessage(){
        server.undoLastMessage(this);
    }

    public void blockUser(String userToBlock) {
        server.blockUser(this.name, userToBlock);
    }

    public void viewChatHistoryWithUser(String otherUser) {
        server.viewChatHistoryWithUser(this.name, otherUser);
    }

    public ChatHistory getChatHistory(){
        return server.getChatHistoryForUser(this.getName());
    }


    public ArrayList<String> getBlocked() {
        return blocked;
    }

    public String getName() {
        return name;
    }

    @Override
    public UserMessageIterator iterator(User userToSearchWith) {
        return new UserMessageIterator(userToSearchWith);
    }

    public Iterator<Message> getMessageIterator(User userToSearchWith) {
        ChatHistory chatHistory = userToSearchWith.getChatHistory();
        if (chatHistory != null) {
            return chatHistory.iterator(userToSearchWith);
        } else {
            // Handle the case when chatHistory is null (e.g., log an error or return an empty iterator)
            return new ArrayList<Message>().iterator();
        }
    }
}

