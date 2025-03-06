package structural.proxy.virtualProxy;

public class RealTask implements Task {

    public void request() {
        System.out.println("real work");
    }

}
