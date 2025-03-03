Design patterns are general, reusable solutions to common problems in software design. They are categorized into three main types: **Creational**, **Structural**, and **Behavioral** patterns. Here's a breakdown of these categories and some key patterns within each:

### 1. **Creational Design Patterns**
These patterns deal with object creation mechanisms, trying to create objects in a way that is suitable for the situation. They abstract the instantiation process and make it more flexible.

- **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
- **Factory Method**: Defines an interface for creating objects, but lets subclasses alter the type of objects that will be created.
- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
- **Prototype**: Creates new objects by copying an existing object, known as the prototype.

### 2. **Structural Design Patterns**
These patterns deal with object composition and help to simplify the structure by identifying simple ways to realize relationships between objects.

- **Adapter**: Allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces.
- **Bridge**: Decouples an abstraction from its implementation, allowing both to vary independently.
- **Composite**: Composes objects into tree-like structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
- **Decorator**: Adds new responsibilities to an object dynamically, without affecting other objects of the same class.
- **Facade**: Provides a simplified interface to a complex subsystem, making it easier to use.
- **Flyweight**: Reduces the number of objects created by sharing common data between objects, thus saving memory.
- **Proxy**: Provides a surrogate or placeholder object that controls access to another object.

### 3. **Behavioral Design Patterns**
These patterns are concerned with the interaction and responsibility between objects and how they communicate with each other.

- **Chain of Responsibility**: Allows passing a request along a chain of handlers. Each handler can either process the request or pass it to the next handler in the chain.
- **Command**: Encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations.
- **Interpreter**: Defines a grammatical representation for a language and provides an interpreter to interpret the sentences in the language.
- **Iterator**: Provides a way to access the elements of a collection sequentially without exposing its underlying representation.
- **Mediator**: Defines an object that centralizes communication between objects, reducing the dependencies between them.
- **Memento**: Captures and externalizes an object's internal state so that it can be restored later, without violating encapsulation.
- **Observer**: Defines a dependency between objects so that when one object changes state, all its dependent objects are notified and updated automatically.
- **State**: Allows an object to alter its behavior when its internal state changes, appearing as if the object has changed its class.
- **Strategy**: Defines a family of algorithms and allows selecting one to be used at runtime.
- **Template Method**: Defines the skeleton of an algorithm, deferring some steps to subclasses.
- **Visitor**: Allows adding further operations to objects without changing them.

These design patterns help solve common design problems by providing best practices and established solutions.