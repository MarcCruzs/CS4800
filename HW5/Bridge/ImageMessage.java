package HW5.Bridge;

public class ImageMessage implements MessageType {
    private MessagingApp messagingApp;
    private Media content;

    @Override
    public void setMessageApp(MessagingApp messagingApp) {
        this.messagingApp = messagingApp;
    }

    @Override
    public void setContent(Media content) {
        this.content = content;
    }

    @Override
    public String getMediaType() {
        return "Image";
    }

    @Override
    public <MediaType> MediaType getContent() {
        return (MediaType) content;
    }

    @Override
    public void sendMessage() {
        System.out.println(getMediaType() + " sent via " + messagingApp.getClass().getSimpleName());
    }
}
