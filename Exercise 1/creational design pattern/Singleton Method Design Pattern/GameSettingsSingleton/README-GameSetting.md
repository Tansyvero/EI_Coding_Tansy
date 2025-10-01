###### 🎮 **Game Settings Manager - Singleton Pattern** 



**Overview**



This project demonstrates the Singleton Design Pattern using a Game Settings Manager.

The Singleton ensures that only one instance of the SettingsManager exists, providing a single point of control for all game settings across the application.

Users can interactively set:

•🎵 Volume (0–100)

•⚡ Difficulty (Easy, Normal, Hard)

•🖥️ Screen Resolution (e.g., 1920x1080)

All changes are reflected globally because there is only one SettingsManager instance.



**Features**



•Interactive console input for game settings

•Input validation and error handling to ensure correct values

•Singleton design pattern implementation

•Centralized display of current settings



**Usage**



1️⃣ Compile the Java files

cd src

javac \*.java

2️⃣ Run the program

java Main

3️⃣ Example Interaction

Enter game volume (0-100): 80

Enter game difficulty (Easy, Normal, Hard): Hard

Enter screen resolution (e.g., 1920x1080): 2560x1440



Current Game Settings:

Volume: 80

Difficulty: Hard

Screen Resolution: 2560x1440



**Why Singleton?**



•Guarantees only one instance of SettingsManager

•Provides a global access point to game settings

•Prevents inconsistencies and multiple conflicting settings



**Project Structure**



GameSettingsSingleton/

│

├── src/

│   ├── Main.java          # User input and client code

│   └── SettingsManager.java # Singleton class for game settings

└── README.md              # This file



