The **Adapter Pattern** is a design pattern in software development that acts as a bridge between two incompatible interfaces. It allows classes with incompatible interfaces to work together by providing a way to adapt one interface to another, without modifying the original code.

This pattern is commonly used when you have an existing class with an interface that doesn't match the one you need, and you want to reuse that class without changing its code. Instead, you create an adapter that transforms its interface to the one you need.

### Key Concepts:

1.  **Target Interface**: This is the interface the client expects.
2.  **Adapter**: This is a class that implements the target interface and translates the requests to a format understood by the adaptee.
3.  **Adaptee**: This is the existing class with an incompatible interface.
4.  **Client**: The code that uses the target interface.

### Types of Adapter Patterns:

1.  **Class Adapter**: Uses multiple inheritance to adapt one interface to another.
2.  **Object Adapter**: Uses composition, where an adapter holds an instance of the adaptee and translates the requests.

### When to Use the Adapter Pattern:

-   When you want to use an existing class, but its interface doesn't match the one you need.
-   When you need to integrate different subsystems that were developed independently and have incompatible interfaces.
-   When you are working with third-party or legacy code that cannot be modified.

### Benefits:

-   **Flexibility**: You can reuse classes with incompatible interfaces.
-   **Decoupling**: The client code is decoupled from the implementation of the adaptee, making it easier to change the adaptee without affecting the client.


### 1\. **Class Adapter in Java (Using Inheritance)**

In Java, **multiple inheritance** (inheriting from multiple classes) isn't supported directly, so we can't demonstrate the traditional **class adapter** with inheritance. However, we can mimic the concept by having an adapter class that extends both a target interface and an adaptee class via **interfaces**.

In Java, you can **extend** a class and **implement** interfaces, so here's how we can structure it:

```
// The target interface that the client expects
interface Target {
    void request();
}

// The adaptee class (existing system with an incompatible interface)
class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request from adaptee");
    }
}

// Class Adapter (Mimicking multiple inheritance in Java)
class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();  // Delegate the request to the adaptee's method
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();  // Uses the adapted interface
    }
}

```

### Explanation of Class Adapter:

-   The `Adapter` class **extends** the `Adaptee` class and **implements** the `Target` interface. This is as close as Java can get to the **Class Adapter** concept by using inheritance.
-   The `request()` method is part of the **Target** interface, but the `Adapter` implements it by calling the `specificRequest()` method from the `Adaptee` class.

### 2\. **Object Adapter in Java (Using Composition)**

The **Object Adapter** pattern in Java is more natural and uses **composition** to achieve the goal. The adapter holds an instance of the adaptee and delegates the work to it.

```
// The target interface that the client expects
interface Target {
    void request();
}

// The adaptee class (existing system with an incompatible interface)
class Adaptee {
    public void specificRequest() {
        System.out.println("Specific request from adaptee");
    }
}

// Object Adapter (using composition)
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();  // Delegate the request to the adaptee's method
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();  // Uses the adapted interface
    }
}

```

### Explanation of Object Adapter:

-   The `Adapter` class implements the `Target` interface, but instead of inheriting from the `Adaptee`, it **contains** an instance of `Adaptee` and delegates the `request()` method to the `specificRequest()` method in `Adaptee`.
-   This approach is more flexible, especially in Java, where you cannot use multiple inheritance for classes.

### Key Differences Recap in Java:

-   **Class Adapter** (using inheritance) extends both the adaptee class and implements the target interface. However, in Java, you can't inherit from multiple classes, so this pattern is limited to interfaces for the target.
-   **Object Adapter** (using composition) works by holding an instance of the adaptee and delegating calls to it, which is more common and recommended in Java.

Let me know if you need further clarification or examples!