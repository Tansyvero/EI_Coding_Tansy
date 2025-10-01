###### **🍽️ Restaurant Order Management System -Command Pattern**



**Overview**



This project demonstrates the Command Design Pattern using a Restaurant Order Management System.

Each customer order is encapsulated as a Command object, which can be executed, queued, undone, or grouped into combos (macro commands).

It’s a real-world relatable example of how the Command pattern can manage tasks flexibly and reliably.



**Features**



•Encapsulation of Orders → Each dish (Pizza, Salad, Coffee) is a separate command.

•Invoker (OrderSystem) → Takes customer requests and executes them.

•Receiver (KitchenStaff) → Prepares food and handles actual work.

•Undo Support → Cancel the last order if the customer changes their mind.

•Macro Commands → Combo meals (Pizza + Salad + Coffee) execute multiple commands at once.

•Exception Handling → Random failures (oven malfunction, missing ingredients, machine errors) are simulated and handled gracefully.



**Project Structure**



RestaurantOrderSystem/

│── src/

│   ├── Command.java            # Command interface

│   ├── KitchenStaff.java       # Receiver

│   ├── MakePizzaCommand.java   # Concrete command

│   ├── MakeSaladCommand.java   # Concrete command

│   ├── MakeCoffeeCommand.java  # Concrete command

│   ├── MacroCommand.java       # Macro (combo) command

│   ├── OrderSystem.java        # Invoker

│   └── Main.java               # Entry point with console menu



**Example Run**



1\. Order Pizza

2\. Order Salad

3\. Order Coffee

4\. Combo Meal

5\. Cancel Last Order

6\. Exit



Choose option: 1

Cooking pizza...



Choose option: 2

Preparing salad...



Choose option: 5

Undo salad order.



Choose option: 6

Exiting. Thank you!



**Why Command Pattern?**



✔️ Easy to extend with new dishes (just add a new Command).

✔️ Supports queuing, undo, and macro execution.

✔️ Separates request (Invoker) from execution (Receiver).

✔️ Real-world relatable → restaurant workflow.



