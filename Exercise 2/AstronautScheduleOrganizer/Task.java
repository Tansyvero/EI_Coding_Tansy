// Task class represents a single task in the astronaut daily schedule
public class Task {
    private String description; // Description of the task
    private String startTime;   // Task start time in HH:mm format
    private String endTime;     // Task end time in HH:mm format
    private String priority;    // Task priority (Low, Medium, High)
    private boolean completed;  // Flag to indicate if the task is completed
    // Constructor to initialize a new task
    public Task(String description, String startTime, String endTime, String priority) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.priority = priority;
        this.completed = false; // Task is incomplete by default
    }
    // Getter for task description
    public String getDescription() { return description; }
    // Setter for task description
    public void setDescription(String description) { this.description = description; }
    // Getter for start time
    public String getStartTime() { return startTime; }
    // Setter for start time
    public void setStartTime(String startTime) { this.startTime = startTime; }
    // Getter for end time
    public String getEndTime() { return endTime; }
    // Setter for end time
    public void setEndTime(String endTime) { this.endTime = endTime; }
    // Getter for priority
    public String getPriority() { return priority; }
    // Setter for priority
    public void setPriority(String priority) { this.priority = priority; }
    // Check if task is completed
    public boolean isCompleted() { return completed; }
    // Mark task as completed
    public void markCompleted() { completed = true; }
    // Override toString method to display task information
    @Override
    public String toString() {
        // Display start-end time, description, priority, and "(Completed)" if task is completed
        return startTime + " - " + endTime + ": " + description + " [" + priority + "]" + (completed ? " (Completed)" : "");
    }
}
