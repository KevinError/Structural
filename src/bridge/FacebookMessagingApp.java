package bridge;

public class FacebookMessagingApp implements MessagingApp{
    private MessageType messageType;

    public FacebookMessagingApp(MessageType messageType){
        this.messageType = messageType;
    }

    public void sendMessage(){
        System.out.println("Send a message through Facebook");
        messageType.send();
    }
}
