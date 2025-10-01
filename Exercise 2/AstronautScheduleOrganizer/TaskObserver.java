// TaskObserver interface defines a contract for classes that want to be notified of task conflicts
public interface TaskObserver { 
    /**
     * Method to notify observers when a new task conflicts with an existing task
     *
     * @param existingTask The task that is already scheduled
     * @param newTask      The new task that is causing a conflict
     */
    void notifyConflict(Task existingTask, Task newTask);
}
