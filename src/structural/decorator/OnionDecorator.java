package structural.decorator;

//  ConcreteDecorator: A class that extends the decorator and adds extra behavior to the component.
public class OnionDecorator extends PizzaDecorator {

    public OnionDecorator(BasePizza pizza) {
        super(pizza);
    }

    public double cost() {
//        return this.pizza.cost() + 15;
        return super.cost() + 15;

    }

    public String seasoning() {
        return this.pizza.seasoning() + " onion";
    }
}
