package HW6.Memento_Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {
    private List<MessageMemento> messageHistory;

    public ChatHistory() {
        this.messageHistory = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messageHistory.add(new MessageMemento(message));
    }

    public MessageMemento createMemento() {
        if (!messageHistory.isEmpty()) {
            return messageHistory.get(messageHistory.size() - 1); // Get the Memento of the last message
        }
        return null;
    }


    public void removeLastMessage(User user) {
        if (!messageHistory.isEmpty()) {
            for (int i = messageHistory.size() - 1; i >= 0; i--) {
                MessageMemento memento = messageHistory.get(i);
                if (memento.getSender().equals(user.getName())) {
                    messageHistory.remove(i);
                }
            }
        }
    }


    public void printChatHistory(String userName) {
        for (MessageMemento memento : messageHistory) {
            String message = memento.getMessageContent();
            String timestamp = memento.getTimestamp();
            String sender = memento.getSender();
            List<String> recipients = memento.getRecipients();

            if (sender.equals(userName) || recipients.contains(userName)) {
                StringBuilder recipientString = new StringBuilder();
                for (int i = 0; i < recipients.size(); i++) {
                    recipientString.append(recipients.get(i));
                    if (i < recipients.size() - 1) {
                        recipientString.append(", ");
                    }
                }
                System.out.println("[" + timestamp + "] " + sender + " -> " + recipientString + ": " + message);
            }
        }
    }
}

