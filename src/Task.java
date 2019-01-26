import java.util.Date;

public class Task {

    private final String name;
    private final Date estimatedFinish;
    private Date startTime;
    private final Date deadline;

    public Task(String name, Date estimatedFinish, Date deadline) {
        this.name = name;
        this.estimatedFinish = estimatedFinish;
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

    public Date getEstimatedFinish() {
        return estimatedFinish;
    }

    public Date getDeadline() {
        return deadline;
    }
}
