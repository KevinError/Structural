import bridge.*;
public class BridgeMain {
    public static void main(String[] args) {
        MessageType textMessage = new TextMessage("Hello world");
        MessageType imageMessage = new ImageMessage("image.jpg");
        MessageType videoMessage = new VideoMessage("video.mp4");

        MessagingApp whatsappText = new WhatsAppMessagingApp(textMessage);
        MessagingApp whatsappImage = new WhatsAppMessagingApp(imageMessage);
        MessagingApp whatsappVideo = new WhatsAppMessagingApp(videoMessage);

        MessagingApp telegramText = new TelegramMessagingApp(textMessage);
        MessagingApp telegramImage = new TelegramMessagingApp(imageMessage);
        MessagingApp telegramVideo = new TelegramMessagingApp(videoMessage);

        MessagingApp facebookText = new FacebookMessagingApp(textMessage);
        MessagingApp facebookImage = new FacebookMessagingApp(imageMessage);
        MessagingApp facebookVideo = new FacebookMessagingApp(videoMessage);

        whatsappText.sendMessage();
        whatsappImage.sendMessage();
        whatsappVideo.sendMessage();

        telegramText.sendMessage();
        telegramImage.sendMessage();
        telegramVideo.sendMessage();

        facebookText.sendMessage();
        facebookImage.sendMessage();
        facebookVideo.sendMessage();
    }
}