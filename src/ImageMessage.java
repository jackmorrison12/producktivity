import java.awt.image.BufferedImage;

public class ImageMessage extends Message {

  private final BufferedImage img;

  public ImageMessage(BufferedImage img) {
    this.img = img;
  }

  @Override
  public BufferedImage getMessageImage(){
    return img;

  }

}
