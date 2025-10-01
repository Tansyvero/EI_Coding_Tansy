###### **Astronaut Daily Schedule Organizer**



**Overview**



This is a console-based Java application that helps astronauts organize their daily schedules. Users can add, remove, edit, view, and manage tasks with priority levels. It ensures that tasks do not overlap and allows marking tasks as completed.

The project demonstrates object-oriented programming, use of design patterns (Singleton, Factory, Observer), and proper error handling.



**Features**



**Mandatory**



1.Add Task – Add a task with description, start time, end time, and priority.

2.Remove Task – Remove a task by description.

3.View Tasks – View all tasks sorted by start time.

4.Conflict Validation – New tasks cannot overlap with existing tasks.

5.Error Messages – Displays errors for invalid operations.



**Optional**



1.Edit Task – Modify task details like description, time, or priority.

2.Mark Completed – Mark tasks as completed.

3.View by Priority – Filter tasks based on priority level.



**Classes \& Design**



**1.Task**



•Represents a single task.

•Stores description, start time, end time, priority, and completion status.



**2.ScheduleManager**



•Singleton class that manages all tasks.

•Handles adding, removing, editing, and viewing tasks.

•Checks for conflicts and notifies observers.



**3.TaskFactory**



•Factory pattern used to create Task objects.



**4.TaskObserver**



•Observer interface for conflict notifications.



**5.ConsoleUI**



•Handles user input through the console.

•Implements TaskObserver to display conflict messages.



**6.Main**



•Entry point of the program.

•Starts the console UI.



**Example Usage**



1\. Add Task

2\. Remove Task

3\. View Tasks

4\. Edit Task

5\. Mark Task Completed

6\. View by Priority

7\. Exit

Enter choice: 1

Description: Morning Exercise

Start Time (HH:mm): 07:00

End Time (HH:mm): 08:00

Priority (Low/Medium/High): High

Task added successfully. No conflicts.



**Design Patterns Used**



1.Singleton – ScheduleManager ensures only one instance manages tasks.

2.Factory – TaskFactory creates Task objects.

3.Observer – ConsoleUI is notified of task conflicts.



