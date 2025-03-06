package structural.proxy.remoteProxy;

public class ProxyBankingService implements BankingService{

    private RealBankingService service;
    private String serverAddress;

    public ProxyBankingService(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public RealBankingService getRealBankingService() {
        if(service == null) {
            try {
                System.out.println("Connecting to the remote banking service at " + serverAddress + "...");
                Thread.sleep(2000); // Simulating network delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            service = new RealBankingService();
        }
        return service;
    }

    public void deposit(double amount) {
        getRealBankingService().deposit(amount);
    }

    public void withdraw(double amount) {
        getRealBankingService().withdraw(amount);
    }

    public double getBalance() {
        return getRealBankingService().getBalance();
    }

}
