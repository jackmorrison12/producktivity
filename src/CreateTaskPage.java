import java.awt.Color;
import java.util.Properties;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class CreateTaskPage implements Updatable {

  final Color backgroundCol = new Color(163, 238, 216);

  public static void main(String[] args) {
    new CreateTaskPage();
  }

  public CreateTaskPage (/*ActionListener controller*/) {
    JFrame frame = new JFrame("Create a New Task");
    frame.setSize(250,400);
    frame.setBackground(backgroundCol);

    // Setting up panels
    JPanel titlePanel = new JPanel();
    JPanel detailsPanel = new JPanel();
    titlePanel.setBackground(backgroundCol);
    detailsPanel.setBackground(backgroundCol);

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel title = new JLabel("new task!", JLabel.CENTER);
    Border titleBorder = BorderFactory
        .createLineBorder(new Color(255, 152, 0), 3);
    title.setBorder(titleBorder);
    title.setBackground(new Color(255, 203,
        61));
    title.setOpaque(true);

    JLabel task = new JLabel("task: ");
    JTextField textfield = new JTextField(10);
    Border taskBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    task.setBorder(taskBorder);
    task.setBackground(new Color(255, 227, 96));
    task.setOpaque(true);

    // Dropdown time choice
    JLabel estimation = new JLabel("expected time: ");
    Border estimateBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    estimation.setBorder(estimateBorder);
    estimation.setBackground(new Color(255, 227, 96));
    estimation.setOpaque(true);

    Vector<String> choices = new Vector<>();
    for(int i =15; i <= 240; i += 15) {
      choices.add(Integer.toString(i));
    }
    JComboBox<String> timeCombo = new JComboBox<>(choices);

    // Dropdown date picker
    JLabel deadline = new JLabel("deadline: ");
    Border deadlineBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    deadline.setBorder(deadlineBorder);
    deadline.setBackground(new Color(255, 227, 96));
    deadline.setOpaque(true);

    Properties p = new Properties();
    p.put("text.today", "today");
    p.put("text.month", "month");
    p.put("text.year", "year");

    UtilDateModel model = new UtilDateModel();
    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

    // Notes section
    JLabel noteLabel = new JLabel("notes: ");
    Border noteBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 1);
    noteLabel.setBorder(noteBorder);
    noteLabel.setBackground(new Color(255, 227, 96));
    noteLabel.setOpaque(true);

    JTextArea notes = new JTextArea(10, 10);
    notes.setLineWrap(true);
    JScrollPane scroll = new JScrollPane(notes);
    Border scrollBorder = BorderFactory
        .createLineBorder(new Color(255, 203,
            61), 2);
    scroll.setBorder(scrollBorder);

    // Add button
    JButton addButton = new JButton("add!");

    titlePanel.add(title);
    detailsPanel.add(task);
    detailsPanel.add(textfield);
    detailsPanel.add(estimation);
    detailsPanel.add(timeCombo);
    detailsPanel.add(deadline);
    detailsPanel.add(datePicker);
    detailsPanel.add(noteLabel);
    detailsPanel.add(scroll);
    detailsPanel.add(addButton);

    titlePanel.setMaximumSize(titlePanel.getPreferredSize());

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
