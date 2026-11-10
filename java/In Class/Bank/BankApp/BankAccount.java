public abstract class BankAccount {

    double balance;

    
    public BankAccount(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        balance -= amount;
    }

    
    public abstract double calculateInterest();
}