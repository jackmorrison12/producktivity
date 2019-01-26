import java.util.Properties;
import java.util.Vector;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class CreateTaskPage implements Updatable {

  public static void main(String[] args) {
    new CreateTaskPage();
  }

  public CreateTaskPage (/*ActionListener controller*/) {

    JFrame frame = new JFrame("Create a New Task");
    frame.setSize(250,400);

    // Setting up panels
    JPanel titlePanel = new JPanel();
    JPanel detailsPanel = new JPanel();

    frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

    JLabel title = new JLabel("new task!", JLabel.CENTER);

    JLabel task = new JLabel("task: ");
    JTextField textfield = new JTextField(10);

    // Dropdown time choice
    JLabel estimation = new JLabel("expected time: ");
    Vector<String> choices = new Vector<>();
    for(int i =15; i <= 240; i += 15) {
      choices.add(Integer.toString(i));
    }
    JComboBox<String> timeCombo = new JComboBox<>(choices);

    // Dropdown date picker
    JLabel deadline = new JLabel("deadline: ");
    Properties p = new Properties();
    p.put("text.today", "today");
    p.put("text.month", "month");
    p.put("text.year", "year");

    UtilDateModel model = new UtilDateModel();
    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

    // Notes section
    JLabel noteLabel = new JLabel("notes: ");
    JTextArea notes = new JTextArea(10, 10);

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
    detailsPanel.add(notes);
    detailsPanel.add(addButton);

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
