package HW5.Bridge;

interface MessageType {
    void setMessageApp(MessagingApp messagingApp);
    void setContent(Media content);
    String getMediaType();
    <MediaType> MediaType getContent();
    void sendMessage();
}
