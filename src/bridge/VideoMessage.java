package bridge;

public class VideoMessage implements MessageType{
    private String video;

    public VideoMessage(String video){
        this.video = video;
    }

    public void send(){
        System.out.println("Sending a video message");
    }


}
