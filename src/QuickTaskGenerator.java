import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class QuickTaskGenerator implements TaskGenerator {

    List<String> tasks = new ArrayList<>();
    Random rand = new Random();
    Calendar cal = Calendar.getInstance();

    public QuickTaskGenerator() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("FunThings/TextTasks.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            tasks.add(sc.nextLine());
            sc.nextLine();
        }
    }

    @Override
    public Task getTask() {
        String task = tasks.get(rand.nextInt(tasks.size()));
        String[] taskInfo = task.split(";");
        Date in10mins = new Date(System.currentTimeMillis() + Integer.getInteger(taskInfo[2])*60000);
        return new Task(taskInfo[0], Integer.getInteger(taskInfo[1])*60000, in10mins);
    }
}