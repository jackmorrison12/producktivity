import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TaskPage implements Updatable {

  public static void main(String[] args) {
    new TaskPage();
  }

  public TaskPage(/*ActionListener controller*/) {
    JFrame frame = new JFrame("Current Task");
    frame.setSize(300,300);

    JPanel titlePanel = new JPanel();
    JPanel clockPanel = new JPanel();
    JPanel notesPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();

    frame.setLayout(new BorderLayout());

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel taskName = new JLabel("[task name]");

    // Notes section
    JLabel noteLabel = new JLabel("notes: ");
    JTextArea notes = new JTextArea(10, 10);

    // Timer
    JLabel clockLabel = new JLabel("[CLOCK]");

    // Buttons
    JButton pause = new JButton("pause");
    JButton done = new JButton("done!");
    JButton editTime = new JButton("edit");

    titlePanel.add(taskName);
    notesPanel.add(noteLabel);
    notesPanel.add(notes);
    clockPanel.add(clockLabel);
    buttonsPanel.add(pause);
    buttonsPanel.add(done);
    buttonsPanel.add(editTime);


    frame.add(titlePanel, BorderLayout.NORTH);
    frame.add(notesPanel, BorderLayout.WEST);
    frame.add(clockPanel,BorderLayout.EAST);
    frame.add(buttonsPanel, BorderLayout.SOUTH);
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
