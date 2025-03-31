import java.util.List;
import java.util.ArrayList;

public class Epic extends Task {
    private List<Subtask> subtasks;

    public Epic(int id, String name) {
        super(id, name, TaskStatus.NEW);
        this.subtasks = new ArrayList<>();
    }

    public List<Subtask> getSubtasks() {
        return subtasks;
    }

    public void addSubtask(Subtask subtask) {
        subtasks.add(subtask);
    }

    @Override
    public String toString() {
        return "Epic{id=" + id + ", name='" + name + "', status=" + status + ", subtasks=" + subtasks + "}";
    }
}