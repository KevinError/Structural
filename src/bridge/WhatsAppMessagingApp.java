package bridge;

public class WhatsAppMessagingApp implements MessagingApp{
    private MessageType messageType;

    public WhatsAppMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessage() {
        System.out.println("Send a message through Whats App");
        messageType.send();
    }

}
