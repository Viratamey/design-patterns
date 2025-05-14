### Key Concepts:

-   **Component**: An interface or abstract class that defines the operations. (BasePizza)
-   **ConcreteComponent**: The base object that implements the component interface. (VegPizza and CheesePizza)
-   **Decorator**: An abstract class that implements the component interface and holds a reference to a component object. (PizzaDecorator)
-   **ConcreteDecorator**: A class that extends the decorator and adds extra behavior to the component. (OnionDecorator and ChilliFlakesDecorator)