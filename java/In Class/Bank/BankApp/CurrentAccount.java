public class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}