###### **AR -Bridge Pattern** 



**Objective**



This project demonstrates the Bridge Design Pattern using Augmented Reality (AR) filters and engines.

It separates abstractions (filters) from implementations (engines like ARCore, ARKit).



**Project Structure**



AR/

│

├── abstraction/

│   ├── ARFilter.java      # Abstract filter class (Abstraction)

│   └── FaceFilter.java    # Example filter (Refined Abstraction)

│

├── implementor/

│   ├── AREngine.java      # Interface for AR Engines (Implementor)

│   ├── ARCoreEngine.java  # Concrete Implementor - ARCore

│   └── ARKitEngine.java   # Concrete Implementor - ARKit

│

├── Main.java              # Main class with interactive console program

└── README.md              # Project documentation



**How It Works**



Abstraction Layer (ARFilter)

Defines filters that can be applied, without depending on specific AR engines.



Implementor Layer (AREngine)

Defines different AR engines like ARCore and ARKit.



Bridge

The ARFilter has a reference to an AREngine, so filters can work with any engine.



**Sample Run** 



Choose AR Engine (1 = ARCore, 2 = ARKit, 0 = Exit): 

1

Enter filter name (or type 'exit' to stop): Glasses

Rendering Glasses using ARCore



Choose AR Engine (1 = ARCore, 2 = ARKit, 0 = Exit): 

2

Enter filter name (or type 'exit' to stop): Crown

Rendering Crown using ARKit



Choose AR Engine (1 = ARCore, 2 = ARKit, 0 = Exit): 

0

Exiting program...



**Concepts Shown**



* Bridge Design Pattern
* Exception Handling (invalid filter names)
* User Input Handling with Scanner
* Extensibility (easy to add new filters or engines)
