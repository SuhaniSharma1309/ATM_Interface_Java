
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
