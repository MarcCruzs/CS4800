package HW6.Memento_Mediator;
import java.util.ArrayList;

public class Message {
    private String sender;
    private String messageContent;
    private String timestamp;
    ArrayList<String> recipients = new ArrayList<>();

    public Message() {
        this.sender = null;
        this.timestamp = null;
        this.messageContent = null;
        this.recipients = null;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public ArrayList<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(ArrayList<String> recipients) {
        this.recipients = recipients;
    }
}
