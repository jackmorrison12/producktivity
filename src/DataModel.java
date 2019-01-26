import java.util.List;

public interface DataModel {

    public void addTask(Task newTask);

    public void removeTask(Task finishedTask);

    public List<Task> getTasks();

}
