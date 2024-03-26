package HW5.Bridge;

public class Main {
    public static void main(String[] args) {
        // Create messaging apps
        MessagingApp whatsapp = new WhatsAppMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();

        // Create message types
        MessageType textMessage = new TextMessage();
        MessageType imageMessage = new ImageMessage();
        MessageType videoMessage = new VideoMessage();

        // Set messaging apps for message types
        textMessage.setMessageApp(whatsapp);
        imageMessage.setMessageApp(telegram);
        videoMessage.setMessageApp(whatsapp);

        // Set content for message types
        textMessage.setContent(new Text("Hello, world!"));
        imageMessage.setContent(new Image("Image"));
        videoMessage.setContent(new Video("Video"));

        // Send messages
        whatsapp.sendMessage(textMessage);
        telegram.sendMessage(imageMessage);
        whatsapp.sendMessage(videoMessage);

    }
}
