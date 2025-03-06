package structural.proxy.virtualProxy;

public class ProxyTask implements Task {

    private RealTask realTask;

    public void request() {
        if(realTask == null) {
            realTask = new RealTask();
        }
        System.out.println("Delegating request to Real object");
        realTask.request();
    }
}
