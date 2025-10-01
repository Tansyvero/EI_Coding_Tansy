###### **Time-Travel - Adapter 🌌⏳**



**Overview**



This project demonstrates the Adapter Design Pattern in Java using a fun and creative example: a Time Machine that can read ancient scrolls with mystical date formats and travel to the corresponding year.

•Adapter Pattern Purpose: Allows two incompatible interfaces (ancient scrolls and modern time machine) to work together seamlessly.

•Use Case: Travel to different years based on ancient scrolls, mystical phrases, or numeric input.



**Features**



•Supports mystical date phrases like Year of the Dragon, Year of the Phoenix, Year of the Tiger, Year of the Unicorn, Year of the Wolf.

•Supports direct numeric year input (e.g., 2000).

•Case-insensitive input handling (Year of the Tiger, year of the tiger, YEAR OF THE TIGER).

•Unknown phrases default to medieval times (1500).

•Keeps asking for input until user types exit.

•Fun time-travel messages for immersive experience.



**Project Structure**



TimeTravel/

│

├─ src/

│   ├─ Main.java                 # Entry point of the program

│   ├─ TimeMachine.java          # Target interface for modern Time Machine

│   ├─ AncientScrollDate.java    # Adaptee representing ancient scrolls

│   └─ TimeConverterAdapter.java # Adapter converting ancient scrolls to modern years

│

└─ README.md



**Example Run**



Welcome, Time Traveler!

Type an ancient date description (e.g., 'Year of the Dragon', 'Year of the Phoenix').

Or type 'exit' to close the time portal.



Enter your scroll input: year of the tiger

Activating time vortex...

Traveling to year: 1962

Safe travels through the timeline, adventurer!



Enter your scroll input: 2000

Detected direct numeric year...

Activating time vortex...

Traveling to year: 2000

Safe travels through the timeline, adventurer!



Enter your scroll input: exit

Closing time portal... Goodbye, adventurer!



