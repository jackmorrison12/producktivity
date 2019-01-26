public class TextMessage extends Message {

  private final String str;

  public TextMessage(String str) {
    this.str = str;
  }

  @Override
  public String getMessageText(){
    return str;

  }

}
