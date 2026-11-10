public class Main {

    public static void main(String[] args) {

        
        SavingsAccount savings = new SavingsAccount(0);

        savings.deposit(10000);
        savings.withdraw(2000);

        System.out.println("Savings interest: "
                + savings.calculateInterest());


        
        CurrentAccount current = new CurrentAccount(0);

        current.deposit(5000);

        System.out.println("Current interest: "
                + current.calculateInterest());

    }
}