import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class RegisterPage implements Updatable {

  public static void main(String[] args) {
    new RegisterPage();
  }

  public RegisterPage (/*ActionListener controller*/) {

    final Color backgroundCol = new Color(163, 238, 216);

    JFrame frame = new JFrame("Register Page");
    frame.setSize(300,300);

    JPanel titlePanel = new JPanel();
    JPanel logoPanel = new JPanel();
    JPanel detailsPanel = new JPanel();
    titlePanel.setBackground(backgroundCol);
    logoPanel.setBackground(backgroundCol);
    detailsPanel.setBackground(backgroundCol);

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    ImageIcon imageIcon = new ImageIcon("water-logo.png");
    JLabel icon = new JLabel(imageIcon);

    JLabel username = new JLabel("username: ");
    Border userBorder = BorderFactory.createLineBorder(new Color(255, 203,
        61), 3);
    username.setBorder(userBorder);
    username.setBackground(new Color(255, 227, 96));
    username.setOpaque(true);

    JTextField textfield = new JTextField(10);

    JButton enterButton = new JButton("enter");

    titlePanel.add(icon);
    detailsPanel.add(username);
    detailsPanel.add(textfield);
    detailsPanel.add(enterButton);

    frame.add(titlePanel);
    frame.add(detailsPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);

  }

  @Override
  public void update(DataModel model) {

  }

  @Override
  public void updateWith(DataModel model, Message message) {

  }

}
