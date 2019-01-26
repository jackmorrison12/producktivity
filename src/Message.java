import java.awt.image.BufferedImage;

public abstract class Message {

    private  enum messageType{TEXT,IMAGE};

    public String getMessageText() {
        return null;
    }

    public BufferedImage getMessageImage() {
        return null;
    }

}
