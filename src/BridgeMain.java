import bridge.*;
public class BridgeMain {
    public static void main(String[] args) {
        MessageType textMessage = new TextMessage("text file");
        MessageType imageMessage = new ImageMessage("image file");
        MessageType videoMessage = new VideoMessage("video file");
        //whatsapp
        MessagingApp whatsappText = new WhatsAppMessagingApp(textMessage);
        MessagingApp whatsappImage = new WhatsAppMessagingApp(imageMessage);
        MessagingApp whatsappVideo = new WhatsAppMessagingApp(videoMessage);
        //facebook
        MessagingApp facebookText = new FacebookMessagingApp(textMessage);
        MessagingApp facebookImage = new FacebookMessagingApp(imageMessage);
        MessagingApp facebookVideo = new FacebookMessagingApp(videoMessage);
        //telegram
        MessagingApp telegramText = new TelegramMessagingApp(textMessage);
        MessagingApp telegramImage = new TelegramMessagingApp(imageMessage);
        MessagingApp telegramVideo = new TelegramMessagingApp(videoMessage);
        //send message
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