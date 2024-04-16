package HW6.Memento_Mediator;

import java.util.ArrayList;

public class MessageMemento {
    private Message messageState;
    private String messageContent;
    private String timestamp;
    private String sender;
    private ArrayList<String> recipients;

    public MessageMemento(Message messageState) {
        this.messageState = messageState;
        this.messageContent = messageState.getMessageContent();
        this.timestamp = messageState.getTimestamp();
        this.sender = messageState.getSender();
        this.recipients = messageState.getRecipients();
    }

    public Message getMessageState() {
        return messageState;
    }

    public void setMessageState(Message messageState) {
        this.messageState = messageState;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getSender() {
        return sender;
    }

    public ArrayList<String> getRecipients() {
        return recipients;
    }
}

