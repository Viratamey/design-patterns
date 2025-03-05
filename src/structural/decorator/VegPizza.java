package structural.decorator;

//  ConcreteComponent: The base object that implements the component interface.
public class VegPizza implements BasePizza{

    public double cost() {
        return 150;
    }

    public String seasoning() {
        return "veggies";
    }
}
