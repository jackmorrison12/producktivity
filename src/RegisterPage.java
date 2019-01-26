import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterPage implements Updatable {

  public static void main(String[] args) {
    new RegisterPage();
  }

  public RegisterPage (/*ActionListener controller*/) {

    JFrame frame = new JFrame("Register Page");
    frame.setSize(300,300);

    JPanel titlePanel = new JPanel();
    JPanel detailsPanel = new JPanel();

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel title = new JLabel("producktivity", JLabel.CENTER);
    JTextField textfield = new JTextField(10);

    JLabel username = new JLabel("username: ");

    JButton enterButton = new JButton("enter");

    titlePanel.add(title);
    detailsPanel.add(username);
    detailsPanel.add(textfield);
    detailsPanel.add(enterButton);

    frame.add(titlePanel);
    frame.add(detailsPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

  @Override
  public void update(DataModel model) {

  }

  @Override
  public void updateWith(DataModel model, Message message) {

  }

}
