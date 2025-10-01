###### 🏠 **Smart Home Device Factory - Abstract Factory Pattern** 



**Overview**



This project demonstrates the Abstract Factory Design Pattern using a Smart Home Device Simulator.

Each room (Living Room, Bedroom) has a family of devices:

•💡 Light

•🌡 Temperature Control

Using Abstract Factory, the client can create a whole room setup without worrying about the exact device types.

This version allows users to control multiple rooms continuously and exit anytime.



**Features**



•Interactive console menu to select a room or exit.

•Continuous loop allows controlling multiple rooms in a single session.

•Temperature input validation ensures only valid integers are accepted.

•Exception handling prevents crashes from invalid input.

•Fun, creative messages enhance user experience:

&nbsp;Living Room: “Enjoy your cozy Living Room ambiance!”

&nbsp;Bedroom: “Relax and sleep well in your Bedroom!”

•Easily extendable to new rooms or devices.



**Usage**



1️⃣ Compile the Java files

cd src

javac \*.java

2️⃣ Run the program

java Main

3️⃣ Example Interaction

Welcome to Smart Home Simulator!

Choose room to control:

1\. Living Room

2\. Bedroom

3\. Exit

Enter choice: 1

Set desired temperature: 24



Activating devices...

Living Room LED light turned on.

Living Room AC set to 24°C.

Enjoy your cozy Living Room ambiance!



Choose room to control:

1\. Living Room

2\. Bedroom

3\. Exit

Enter choice: 2

Set desired temperature: 28



Activating devices...

Bedroom Ambient light turned on.

Bedroom Heater set to 28°C.

Relax and sleep well in your Bedroom!



Choose room to control:

1\. Living Room

2\. Bedroom

3\. Exit

Enter choice: 3

Exiting Smart Home Simulator. Goodbye!



**Project Structure**



SmartHomeFactory/

│

├── src/

│   ├── Devices.java          # Device interfaces and concrete devices

│   ├── RoomFactory.java      # Abstract Factory and concrete factories

│   └── Main.java             # Client code with continuous menu

└── README.md                 # This file



**Why Abstract Factory?**



•	Ensures devices in a room are consistent and compatible.

•	Allows the client to create a whole family of devices without worrying about specifics.

•	Makes adding new rooms or device types simple and modular.



