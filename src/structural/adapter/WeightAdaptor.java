package structural.adapter;

// Adapter
public class WeightAdaptor implements WeightMachine {
    private WeightMachineAvailable machine;

    WeightAdaptor() {
        this.machine = new WeightMachineAvailable();
    }

    public double getWeight() {
        return machine.getWeightInPounds()*(.4535);
    }
}
