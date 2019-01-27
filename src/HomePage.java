import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class HomePage implements Updatable {

  final Color backgroundCol = new Color(163, 238, 216);

  public static void main(String[] args) {
    new HomePage();
  }

  public HomePage(/*ActionListener controller*/) {
    JFrame frame = new JFrame("Home Page");
    frame.setSize(300,300);

    JPanel titlePanel = new JPanel();
    JPanel taskTitlePanel = new JPanel();
    JPanel taskListPanel = new JPanel();

    titlePanel.setBackground(backgroundCol);
    taskTitlePanel.setBackground(backgroundCol);
    taskListPanel.setBackground(backgroundCol);

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel title = new JLabel("welcome to the pond", JLabel.CENTER);
    Border titleBorder = BorderFactory.createLineBorder(new Color(255, 152, 0), 4);
    title.setBorder(titleBorder);
    title.setBackground(new Color(255, 203,
        61));
    title.setOpaque(true);
    //title.setFont(getFont());

    JLabel tasksLabel = new JLabel("tasks: ");
    Border tasksBorder = BorderFactory.createLineBorder(new Color(255, 203,
        61), 3);
    tasksLabel.setBorder(tasksBorder);
    tasksLabel.setBackground(new Color(255, 227, 96));
    tasksLabel.setOpaque(true);

    // Listing tasks
    Vector<String> tasks = new Vector<>();
    JList<Vector<String>> tasksList = new JList(tasks);

    // Add a task
    JButton addTask = new JButton("add task");

    titlePanel.add(title);
    taskTitlePanel.add(tasksLabel);
    taskListPanel.add(tasksList);
    taskListPanel.add(addTask);

    frame.add(titlePanel);
    frame.add(taskTitlePanel);
    frame.add(taskListPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

//  private Font getFont() {
//    InputStream stream = ClassLoader.getSystemClassLoader()
//        .getResourceAsStream("handlee-regular.ttf");
//    try {
//      return Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(48f);
//    } catch (FontFormatException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return null;
//  }

  @Override
  public void update(DataModel model) {

  }

  @Override
  public void updateWith(DataModel model, Message message) {

  }



}
