import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
// ScheduleManager is the core class that manages all tasks
// Implements Singleton pattern to ensure only one instance exists
public class ScheduleManager {
    private static ScheduleManager instance; // Single instance of ScheduleManager
    private List<Task> tasks;                // List to store all tasks
    private List<TaskObserver> observers;    // List of observers to notify about conflicts

    // Private constructor to prevent external instantiation (Singleton pattern)
    private ScheduleManager() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }
    // Method to get the single instance of ScheduleManager
    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }
    // Register an observer for task conflicts
    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    // Validate if a time string is in HH:mm format
    private boolean isValidTime(String time) {
        try {
            LocalTime.parse(time); // Parse time, throws exception if invalid
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    // Add a new task
    public void addTask(Task task) {
        // Validate start and end times
        if (!isValidTime(task.getStartTime()) || !isValidTime(task.getEndTime())) {
            System.out.println("Error: Invalid time format.");
            return;
        }

        // Check for conflicts with existing tasks
        for (Task existingTask : tasks) {
            if (isOverlap(existingTask, task)) {
                for (TaskObserver observer : observers) {
                    observer.notifyConflict(existingTask, task); // Notify observer
                }
                return;
            }
        }

        // Add task and sort by start time
        tasks.add(task);
        tasks.sort(Comparator.comparing(Task::getStartTime));
        System.out.println("Task added successfully. No conflicts.");
    }

    // Remove a task by description
    public void removeTask(String description) {
        Task taskToRemove = null;
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                taskToRemove = t;
                break;
            }
        }
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Error: Task not found.");
        }
    }

    // Edit an existing task
    public void editTask(String description, Task newTask) {
        Task existingTask = null;
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description.trim())) { // Find the task
                existingTask = t;
                break;
            }
        }

        if (existingTask == null) {
            System.out.println("Error: Task not found.");
            return;
        }

        // Check for conflicts with other tasks
        for (Task t : tasks) {
            if (!t.equals(existingTask) && isOverlap(t, newTask)) {
                System.out.println("Error: Task conflicts with existing task \"" + t.getDescription() + "\".");
                return;
            }
        }

        // Update task details
        existingTask.setDescription(newTask.getDescription());
        existingTask.setStartTime(newTask.getStartTime());
        existingTask.setEndTime(newTask.getEndTime());
        existingTask.setPriority(newTask.getPriority());

        // Sort tasks by start time after update
        tasks.sort(Comparator.comparing(Task::getStartTime));
        System.out.println("Task \"" + existingTask.getDescription() + "\" updated successfully.");
    }

    // Mark a task as completed
    public void markTaskCompleted(String description) {
        for (Task t : tasks) {
            if (t.getDescription().equalsIgnoreCase(description)) {
                t.markCompleted(); // Set task as completed
                System.out.println("Task \"" + t.getDescription() + "\" marked as completed.");
                return;
            }
        }
        System.out.println("Error: Task not found.");
    }

    // View all tasks
    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled for the day.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    // View tasks filtered by priority
    public void viewTasksByPriority(String priority) {
        boolean found = false;
        for (Task t : tasks) {
            if (t.getPriority().equalsIgnoreCase(priority)) {
                System.out.println(t);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found with priority: " + priority);
        }
    }

    // Check if two tasks overlap
    private boolean isOverlap(Task t1, Task t2) {
        try {
            int start1 = Integer.parseInt(t1.getStartTime().replace(":", ""));
            int end1 = Integer.parseInt(t1.getEndTime().replace(":", ""));
            int start2 = Integer.parseInt(t2.getStartTime().replace(":", ""));
            int end2 = Integer.parseInt(t2.getEndTime().replace(":", ""));

            // Overlap occurs if start1 < end2 AND start2 < end1
            return start1 < end2 && start2 < end1;
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid time format.");
            return true;
        }
    }
}
