import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.util.Comparator.comparing;

public class Backend implements DataModel {

    List<Updatable> observers = new ArrayList<>();
    List<MessageGenerator> msgGens = new ArrayList<>();
    List<Task> activeTasks = new ArrayList<>();
    Random rand = new Random();

    public void addObserver(Updatable observer) {
        observers.add(observer);
    }

    public void addMsgGenerator(MessageGenerator msgGen) {
        msgGens.add(msgGen);
    }

    private void notifyObservers() {
        for(Updatable ob : observers) {
            ob.update(this);
        }
    }

    private void notifyObserversWith(Message message) {
        for(Updatable ob : observers) {
            ob.updateWith(this, message);
        }
    }

    @Override
    public void addTask(Task newTask) {
        activeTasks.add(newTask);
        activeTasks.sort(comparing(Task::getDeadline));
        // Might need to reverse order

        int r = rand.nextInt(3);
        if(r == 0) {
            r = rand.nextInt(msgGens.size());
            Message message = msgGens.get(r).generateMessage();
            notifyObserversWith(message);
        } else {
            notifyObservers();
        }
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
