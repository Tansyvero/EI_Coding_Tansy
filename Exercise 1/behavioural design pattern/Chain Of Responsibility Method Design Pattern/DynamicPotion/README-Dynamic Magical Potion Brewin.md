###### 🧙‍♂️ **Dynamic Magical Potion Brewing System**- Chain of Responsibility Design Pattern 



**Overview**



This project demonstrates the Chain of Responsibility (CoR) Design Pattern using a fantasy-themed potion brewing system.

Each potion ingredient is processed by a chain of magical effect handlers. The chain decides which effect applies without the main program knowing the details of each effect.



**Handlers in the Chain**



•HealingHandler: Adds healing effect if "Herb of Life" is added ✨

•InvisibilityHandler: Adds invisibility effect if "Shadow Dust" is added 🕶

•StrengthHandler: Adds super strength effect if "Dragon Scale" is added 💪



**Features**



•Interactive console input: Users add ingredients to the potion.

•Guided input: Lists available ingredients for beginner-friendly use.

•Dynamic chain processing: Ingredients are passed through the chain until handled.

•Exception handling: Invalid or empty input is gracefully handled with messages.

•Exit anytime: Type "exit" to quit safely.

•Creative and fun: Fantasy-themed effects with emojis.



**Usage**



1.Navigate to the src folder:

2.cd src

3.Compile all Java files:

&nbsp;    javac \*.java

5.Run the program:

&nbsp;    java Main



**Example Interaction**



Welcome to the Dynamic Magical Potion Brewing System!

Type 'exit' to quit.

Available ingredients: Herb of Life, Shadow Dust, Dragon Scale



Add an ingredient to the potion: Herb of Life

Healing effect added to the potion!



Add an ingredient to the potion: Dragon Scale

Super strength effect added to the potion!



Add an ingredient to the potion: Unknown Powder

No magical effect found for 'Unknown Powder'. Please try a valid ingredient.



Add an ingredient to the potion: exit

Exiting Potion Brewing System. Goodbye!



**Why Chain of Responsibility?**



•Decouples ingredient input from effects: Main program doesn’t need to know effect details.

•Flexible and extendable: New magical effects can be added as new handlers without changing existing ones.

•Sequential handling: The chain determines which effect applies in order.



**Project Structure**



DynamicPotion/

│

├── src/

│   ├── PotionHandler.java        # Abstract handler

│   ├── ConcreteHandlers.java     # Healing, Invisibility, Strength handlers

│   └── Main.java                 # Client code with guided input \& exception handling

└── README.md         



