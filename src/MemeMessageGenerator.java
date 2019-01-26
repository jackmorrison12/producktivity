import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MemeMessageGenerator implements MessageGenerator {

  Random rand;

  public MemeMessageGenerator() {
    rand = new Random();
  }

  @Override
  public Message generateMessage() {
    int r = rand.nextInt(18) + 1;
    BufferedImage image = null;
    try {
      image = ImageIO.read(new File("FunThings/Memes/" + r + ".jpg"));
    } catch (IOException e) {
      e.printStackTrace();
    }

    return new ImageMessage(image);
  }
  
}
