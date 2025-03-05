package structural.decorator;

//  ConcreteComponent: The base object that implements the component interface.
public class CheesePizza implements BasePizza {

    public double cost() {
        return 140;
    }

    public String seasoning() {
        return "cheeseburst" ;
    }
}
