The **Facade Pattern** is a structural design pattern that provides a simplified interface to a complex subsystem or a set of interfaces. Instead of dealing directly with multiple classes or complicated code, the facade allows a client to interact with a single, unified interface, making it easier to use.

### Key Concepts:

1.  **Simplified Interface**: The facade pattern defines a higher-level interface that makes it easier to interact with a complex system, hiding the complexities of the subsystem.
2.  **Client Interaction**: The client interacts with the facade rather than dealing with the individual classes or subsystems.
3.  **Decoupling**: The facade decouples the client from the complex subsystem, so the client does not need to know how the subsystem works internally.

### Structure:

-   **Facade**: A class that provides a simplified interface to the subsystem.
-   **Subsystem classes**: Classes that perform complex functionality, which are hidden from the client by the facade.
-   **Client**: The user or code that interacts with the facade instead of the subsystem classes directly.

### Explanation:

-   **Subsystems**: Classes like `DVDPlayer`, `Projector`, `SurroundSound`, and `Lights` represent the subsystems of the home theater.
-   **Facade**: The `HomeTheaterFacade` class provides a simpler interface to the client, simplifying interactions with all the subsystems.
-   **Client**: The `Client` class interacts with the facade rather than the individual subsystems.