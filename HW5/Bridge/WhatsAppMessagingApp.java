package HW5.Bridge;

public class WhatsAppMessagingApp implements MessagingApp{
    @Override
    public void sendMessage(MessageType messageType) {
        messageType.sendMessage();
    }
}
