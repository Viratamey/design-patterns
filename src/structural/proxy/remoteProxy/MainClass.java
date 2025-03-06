package structural.proxy.remoteProxy;

public class MainClass {

    public static void main(String[] args) {
        ProxyBankingService service = new ProxyBankingService("Bank.com");
        System.out.println(service.getBalance());
        service.withdraw(20);
        System.out.println(service.getBalance());
        service.deposit(25);
        System.out.println(service.getBalance());
        service.withdraw(16);
        System.out.println(service.getBalance());
        service.withdraw(8);
        System.out.println(service.getBalance());
    }
}
