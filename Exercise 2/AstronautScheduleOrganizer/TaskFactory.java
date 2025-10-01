// TaskFactory class is responsible for creating Task objects
// Implements the Factory design pattern to centralize task creation
public class TaskFactory {
    /**
     * Creates a new Task object with the given details
     *
     * @param description Description of the task
     * @param startTime   Start time of the task in HH:mm format
     * @param endTime     End time of the task in HH:mm format
     * @param priority    Priority level of the task (Low, Medium, High)
     * @return A new Task object with the specified details
     */
    public static Task createTask(String description, String startTime, String endTime, String priority) {
        return new Task(description, startTime, endTime, priority);
    }
}
