package bridge;

public class ImageMessage implements MessageType{
    private String image;

    public ImageMessage(String image){
        this.image = image;
    }

    public void send() {
        System.out.println("Send an image message");
    }
}
