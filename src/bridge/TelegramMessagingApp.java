package bridge;

public class TelegramMessagingApp implements MessagingApp{
    private MessageType messageType;

    public TelegramMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessage() {
        System.out.println("Send a message through Telegram");
        messageType.send();
    }

}
