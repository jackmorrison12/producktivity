import java.util.Date;

public class Task {

    private final String name;
    private final int duration;
    private Date startTime;
    private final Date deadline;

    public Task(String name, int duration, Date deadline) {
        this.name = name;
        this.duration = duration;
        this.deadline = deadline;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public int getDuration() {
        return duration;
    }

    public Date getDeadline() {
        return deadline;
    }
}
