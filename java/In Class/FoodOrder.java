public class FoodOrder {
    String customerName;
    String foodItem;
    double unitPrice;
    int quantity;

    // Non-parameterized, non-return method
    public void displayOrder() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Unit Price: Rs. " + unitPrice);
        System.out.println("Quantity: " + quantity);
    }

    // Parameterized, non-return method
    public void updateQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    // Non-parameterized, return method
    public double calculateSubtotal() {
        return unitPrice * quantity;
    }

    // Parameterized, return method
    public double calculateFinalTotal(double discountPercentage) {
        double subtotal = calculateSubtotal();
        double discount = subtotal * discountPercentage / 100;
        return subtotal - discount;
    }

    public static void main(String[] args) {
        FoodOrder order1 = new FoodOrder();

        order1.customerName = "Nimal";
        order1.foodItem = "Chicken Burger";
        order1.unitPrice = 850.00;
        order1.quantity = 2;

        order1.displayOrder();

        order1.updateQuantity(3);
        System.out.println("\nQuantity updated to: " + order1.quantity);

        double subtotal = order1.calculateSubtotal();
        double finalTotal = order1.calculateFinalTotal(10);

        System.out.println("Subtotal: Rs. " + subtotal);
        System.out.println("Final Total after 10% discount: Rs. " + finalTotal);
    }
}