package structural.adapter;

public class Client {

    public static void main(String[] args) {
        WeightAdaptor machine = new WeightAdaptor();
        double weight = machine.getWeight();
        System.out.println(weight);
    }
}
