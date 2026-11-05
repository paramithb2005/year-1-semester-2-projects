abstract class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }
}

class CurrentAccount extends BankAccount {

    @Override
    public double calculateInterest() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {

        // Savings Account
        SavingsAccount savings = new SavingsAccount();

        savings.deposit(10000);
        savings.withdraw(2000);

        System.out.println("Savings interest: " +
                savings.calculateInterest());

        // Current Account
        CurrentAccount current = new CurrentAccount();

        current.deposit(5000);

        System.out.println("Current interest: " +
                current.calculateInterest());

        // BankAccount account = new BankAccount();
        // Cannot create an object of an abstract class.
    }
}