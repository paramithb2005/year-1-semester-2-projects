public class BillApp {
    public static void main(String[] args) {
        
        BillCalculator calculator = new BillCalculator();

        
        double bill1 = calculator.calculateBill(49.99);
        System.out.println("1. Single item bill: $" + bill1);

        
        double bill2 = calculator.calculateBill(15.50, 3);
        System.out.println("2. Multiple items bill: $" + bill2);

        
        double bill3 = calculator.calculateBill(100.00, 2, 10.0);
        System.out.println("3. Discounted items bill: $" + bill3);
    }
}
