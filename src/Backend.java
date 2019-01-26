import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Backend implements DataModel {

    List<Updatable> observers = new ArrayList<>();

    List<Task> activeTasks = new ArrayList<>();

    public void addObserver(Updatable observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(Updatable ob : observers) {
            ob.update(this);
        }
    }

    @Override
    public void addTask(Task newTask) {
        activeTasks.add(newTask);
        activeTasks.sort(comparing(Task::getDeadline));
        // Might need to reverse order
        notifyObservers();
    }

    @Override
    public void removeTask(Task finishedTask) {
        activeTasks.remove(finishedTask);
        notifyObservers();
    }

    @Override
    public List<Task> getTasks() {
        return activeTasks;
    }
}
