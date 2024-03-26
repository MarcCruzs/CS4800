package HW5.Bridge;

public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        messageType.sendMessage();
    }
}