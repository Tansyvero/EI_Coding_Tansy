import java.util.Scanner;
// ConsoleUI handles user interaction for the astronaut schedule app
// It implements TaskObserver to get notified about task conflicts
public class ConsoleUI implements TaskObserver {
    private ScheduleManager manager; // Singleton ScheduleManager instance
    private Scanner scanner;         // Scanner to read user input from console

    // Constructor initializes the manager and scanner, and registers as an observer
    public ConsoleUI() {
        manager = ScheduleManager.getInstance(); // Get the single instance of ScheduleManager
        manager.addObserver(this);               // Register this UI to receive conflict notifications
        scanner = new Scanner(System.in);        // Initialize scanner for input
    }

    // Main loop to display menu and handle user choices
    public void start() {
        while (true) {
            System.out.println("\n1. Add Task\n2. Remove Task\n3. View Tasks\n4. Edit Task\n5. Mark Task Completed\n6. View by Priority\n7. Exit");
            System.out.print("Enter choice: ");
            String choice = scanner.nextLine(); // Read user choice

            switch (choice) {
                case "1": addTaskUI(); break;          // Add a new task
                case "2": removeTaskUI(); break;       // Remove an existing task
                case "3": manager.viewTasks(); break;  // View all tasks
                case "4": editTaskUI(); break;         // Edit an existing task
                case "5": markCompletedUI(); break;    // Mark a task as completed
                case "6": viewByPriorityUI(); break;   // View tasks filtered by priority
                case "7": System.out.println("Exiting..."); return; // Exit the program
                default: System.out.println("Invalid choice.");    // Handle invalid input
            }
        }
    }
    // UI method to add a new task
    private void addTaskUI() {
        System.out.print("Description: ");
        String desc = scanner.nextLine();        // Read task description
        System.out.print("Start Time (HH:mm): ");
        String start = scanner.nextLine();       // Read start time
        System.out.print("End Time (HH:mm): ");
        String end = scanner.nextLine();         // Read end time
        System.out.print("Priority (Low/Medium/High): ");
        String priority = scanner.nextLine();    // Read priority
        Task task = TaskFactory.createTask(desc, start, end, priority); // Create task using factory
        manager.addTask(task);                   // Add task to manager
    }
    // UI method to remove a task
    private void removeTaskUI() {
        System.out.print("Enter task description to remove: ");
        String desc = scanner.nextLine();        // Read description
        manager.removeTask(desc);                // Remove from manager
    }
    // UI method to edit an existing task
    private void editTaskUI() {
        System.out.print("Enter task description to edit: ");
        String oldDescription = scanner.nextLine().trim(); // Task to edit

        System.out.print("New Description: ");
        String newDescription = scanner.nextLine().trim(); // New description

        System.out.print("New Start Time (HH:mm): ");
        String newStart = scanner.nextLine().trim();       // New start time

        System.out.print("New End Time (HH:mm): ");
        String newEnd = scanner.nextLine().trim();         // New end time

        System.out.print("New Priority (Low/Medium/High): ");
        String newPriority = scanner.nextLine().trim();    // New priority

        // Create updated task and pass to ScheduleManager
        Task updatedTask = new Task(newDescription, newStart, newEnd, newPriority);
        manager.editTask(oldDescription, updatedTask);
    }

    // UI method to mark a task as completed
    private void markCompletedUI() {
        System.out.print("Enter task description to mark completed: ");
        String desc = scanner.nextLine();         // Read description
        manager.markTaskCompleted(desc);          // Mark it completed in manager
    }

    // UI method to view tasks filtered by priority
    private void viewByPriorityUI() {
        System.out.print("Enter priority to filter (Low/Medium/High): ");
        String priority = scanner.nextLine();     // Read priority
        manager.viewTasksByPriority(priority);    // Show tasks with this priority
    }

    // Implementation of TaskObserver interface
    // Notifies the user if a task conflicts with an existing one
    @Override
    public void notifyConflict(Task existingTask, Task newTask) {
        System.out.println("Error: Task conflicts with existing task \"" + existingTask.getDescription() + "\".");
    }
}
