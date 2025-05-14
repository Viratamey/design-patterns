package structural.decorator;

public class MainClass {

    public static void main(String[] args) {
        BasePizza pizza = new VegPizza();
        pizza = new OnionDecorator(pizza);
        pizza = new ChilliFlakesDecorator(pizza);
        System.out.println(pizza.cost());

        BasePizza cheesePizza = new CheesePizza();
        cheesePizza = new OnionDecorator(cheesePizza);
        cheesePizza = new ChilliFlakesDecorator(cheesePizza);
        cheesePizza = new ChilliFlakesDecorator(cheesePizza);
        System.out.println(cheesePizza.cost());
        cheesePizza = new OnionDecorator(cheesePizza);
        System.out.println(cheesePizza.cost());
        System.out.println(cheesePizza.seasoning());

    }
}
