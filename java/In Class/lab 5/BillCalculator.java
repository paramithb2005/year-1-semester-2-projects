public class BillCalculator {

    
    public double calculateBill(double price) {
        return price;
    }

    
    public double calculateBill(double price, int quantity) {
        return price * quantity;
    }

    
    public double calculateBill(double price, int quantity, double discountPercentage) {
        double total = price * quantity;
        double discount = total * (discountPercentage / 100.0);
        return total - discount;
    }
}