import java.awt.BorderLayout;
import java.awt.Color;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.Timer;
import javax.swing.border.Border;

public class TaskPage implements Updatable {
  static Timer timer;
  static int interval;
  final Color backgroundCol = new Color(163, 238, 216);

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

    titlePanel.setBackground(backgroundCol);
    clockPanel.setBackground(backgroundCol);
    notesPanel.setBackground(backgroundCol);
    buttonsPanel.setBackground(backgroundCol);

    frame.setLayout(new BorderLayout());

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel taskName = new JLabel("[task name]");
    Border taskBorder = BorderFactory
        .createLineBorder(new Color(255, 152, 0), 3);
    taskName.setBorder(taskBorder);
    taskName.setBackground(new Color(255, 203,
        61));
    taskName.setOpaque(true);

    // Notes section
    JLabel noteLabel = new JLabel("notes: ");
    JTextArea notes = new JTextArea(10, 10);
    notes.setLineWrap(true);
    Border notesBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    noteLabel.setBorder(notesBorder);
    noteLabel.setBackground(new Color(255, 227, 96));
    noteLabel.setOpaque(true);

    JScrollPane scroll = new JScrollPane(notes);
    Border tasksBorder = BorderFactory.createLineBorder(new Color(255, 203,
        61), 3);
    scroll.setBorder(tasksBorder);

    // Timer
    interval = 60; // NEED TO SET TIME TO INPUTTED TIME
    JLabel clockLabel = new JLabel(Integer.toString(interval));
    Border clockBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    clockLabel.setBorder(clockBorder);
    clockLabel.setBackground(new Color(255, 227, 96));
    clockLabel.setOpaque(true);

    timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      public void run() {
        clockLabel.setText(Integer.toString(setInterval()));
      }
    }, 1000, 1000);

    // Buttons
    JButton pause = new JButton("pause");
    JButton done = new JButton("done!");
    JButton editTime = new JButton("edit");

    titlePanel.add(taskName);
    notesPanel.add(noteLabel);
    notesPanel.add(scroll);
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

  private static final int setInterval() {
    if (interval == 0) {
      timer.cancel();
      // DISPLAY MESSAGE THAT TIME IS UP
    }
    return interval--;
  }


  @Override
  public void update(DataModel model) {

  }

  @Override
  public void updateWith(DataModel model, Message message) {

  }
}
