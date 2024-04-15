package HW6.Memento_Mediator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.time.LocalDateTime;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Stack;

public class User {
    private String name;
    private ArrayList<String> blocked = new ArrayList<>();
    private Stack<MessageMemento> messageHistory = new Stack<>();
    private Message userMessage = new Message();
    private ChatServer server;

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

    public ArrayList<String> getBlocked() {
        return blocked;
    }

    public String getName() {
        return name;
    }
}

