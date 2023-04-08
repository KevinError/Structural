package bridge;

public class TextMessage implements MessageType{
    private String text;

    public TextMessage(String text){
        this.text = text;
    }

    public void send(){
        System.out.println("Sending a text message: " + this.text);
    }
}
