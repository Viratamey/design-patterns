package structural.decorator;

//  Decorator: An abstract class that implements the component interface and holds a reference to a component object.
public abstract class PizzaDecorator implements BasePizza{

    protected BasePizza pizza;

    public PizzaDecorator(BasePizza pizza) {
        this.pizza = pizza;
    }

    public double cost() {
        return this.pizza.cost();
    }

    public String seasoning() {
        return this.pizza.seasoning();
    }

}
