package structural.proxy.virtualProxy;

public class MainClass {

    public static void main(String[] args) {
        Task task = new ProxyTask();
        task.request();
    }
}
