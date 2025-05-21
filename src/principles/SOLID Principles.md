🔵 1\. **Single Responsibility Principle (SRP)**
------------------------------------------------

> A class should have only one reason to change.

**💡 Real-World Analogy:**  A chef cooks, a cashier handles billing --- don't give one person too many jobs.

**❌ Bad Java Example:**

```java

public class Employee {
    public void calculateSalary() { /* ... */ }
    public void saveToDatabase() { /* ... */ }
    public void generateReport() { /* ... */ }
}
```


**✅ Better Java Example (SRP Applied):**

```java


public class SalaryCalculator {
    public void calculateSalary() { /* ... */ }
}

public class EmployeeRepository {
    public void saveToDatabase() { /* ... */ }
}

public class ReportGenerator {
    public void generateReport() { /* ... */ }
}
```

* * * * *

🟠 2\. **Open/Closed Principle (OCP)**
--------------------------------------

> Classes should be open for extension, but closed for modification.

**💡 Real-World Analogy:**  Add new plugs to a power strip without changing the power strip itself.

**❌ Bad Java Example:**

```java

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            // calculate circle area
        } else if (shape instanceof Rectangle) {
            // calculate rectangle area
        }
        return 0;
    }
}
```

**✅ Better Java Example (OCP Applied):**

```java

public interface Shape {
double area();
}

public class Circle implements Shape {
    public double area() { return Math.PI * 5 * 5; }
}

public class Rectangle implements Shape {
    public double area() { return 10 * 20; }
}

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.area();
    }
}
```

* * * * *

🟡 3\. **Liskov Substitution Principle (LSP)**
----------------------------------------------

> Subtypes should be substitutable for their base types.

**💡 Real-World Analogy:**  A debit card should work anywhere a generic payment card is expected.

**❌ Violating LSP:**

```java

public class Bird {
public void fly() { }
}

public class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}
```

**✅ LSP-Compliant Java Example:**

```java

public class Bird {
    public void makeSound() { }
}

public class FlyingBird extends Bird {
    public void fly() { }
}

public class Sparrow extends FlyingBird { }

public class Ostrich extends Bird { }
```

* * * * *

🟢 4\. **Interface Segregation Principle (ISP)**
------------------------------------------------

> Clients shouldn't be forced to implement interfaces they don't use.

**💡 Real-World Analogy:**  Don't give a scanner the ability to print if it doesn't need to.

**❌ Bad Interface:**

```java

public interface MultiFunctionDevice {
    void print();
    void scan();
    void fax();
}
```

**✅ Better Java Interfaces (ISP Applied):**

```java

public interface Printer {
    void print();
}

public interface Scanner {
    void scan();
}

public class AllInOnePrinter implements Printer, Scanner {
    public void print() { }
    public void scan() { }
}
```

* * * * *

🔴 5\. **Dependency Inversion Principle (DIP)**
-----------------------------------------------

> Depend on abstractions, not concrete classes.

**💡 Real-World Analogy:**  A switch doesn't care if it powers a light bulb, fan, or heater --- just that the device has an on/off method.

**❌ Without DIP:**

```java


public class LightBulb {
    public void turnOn() { }
    public void turnOff() { }
}

public class Switch {
    private LightBulb bulb = new LightBulb();

    public void operate() {
        bulb.turnOn();
    }
}
```

**✅ With DIP:**

```java




public interface Switchable {
    void turnOn();
    void turnOff();
}



public class LightBulb implements Switchable {
    public void turnOn() { }
    public void turnOff() { }
}

public class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
```

* * * * *