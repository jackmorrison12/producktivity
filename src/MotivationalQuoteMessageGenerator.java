import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MotivationalQuoteMessageGenerator implements MessageGenerator {

  List<String> quotes = new ArrayList<>();
  Random rand = new Random();

  public MotivationalQuoteMessageGenerator() {
    Scanner sc = null;
    try {
      sc = new Scanner(new File("FunThings/MotivationalQuotes.txt"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    while (sc.hasNextLine()) {
      quotes.add(sc.nextLine());
      sc.nextLine();

    }
  }

  @Override
  public TextMessage generateMessage(){
    TextMessage message = new TextMessage(quotes.get(rand.nextInt(quotes.size())));
    return message;
  }
}
