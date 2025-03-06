package structural.proxy.remoteProxy;

public class RealBankingService implements BankingService {

    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("balance not available");
        }
    }

    public double getBalance() {
        return balance;
    }

}
