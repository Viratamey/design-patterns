package structural.decorator;

//  ConcreteDecorator: A class that extends the decorator and adds extra behavior to the component.
public class ChilliFlakesDecorator extends PizzaDecorator {

    public ChilliFlakesDecorator(BasePizza pizza) {
        super(pizza);
    }

    public double cost() {
//        return pizza.cost() + 5;
        return super.cost() + 5;

    }

    public String seasoning() {
        return pizza.seasoning() + " chilliFlakes";
    }

}
