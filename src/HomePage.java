import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class HomePage implements Updatable {

  public static void main(String[] args) {
    new HomePage();
  }

  public HomePage(/*ActionListener controller*/) {
    JFrame frame = new JFrame("Home Page");
    frame.setSize(300,300);

    JPanel titlePanel = new JPanel();
    JPanel detailsPanel = new JPanel();

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel title = new JLabel("welcome to the pond", JLabel.CENTER);

    JLabel tasksLabel = new JLabel("tasks: ");

    // Listing tasks
    Vector<String> tasks = new Vector<>();
    JList<Vector<String>> tasksList = new JList(tasks);

    // Add a task
    JButton addTask = new JButton("add task");

    titlePanel.add(title);
    detailsPanel.add(tasksLabel);
    detailsPanel.add(tasksList);
    detailsPanel.add(addTask);

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
