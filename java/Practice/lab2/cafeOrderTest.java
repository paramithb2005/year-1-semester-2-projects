public class cafeOrderTest {
    public static void main(String[] args) {
        cafeOrder order1 = new cafeOrder("Coffee", 2.50);
        cafeOrder order2 = new cafeOrder("Tea", 1.50, 2);
        System.out.println("Cafe Order Bills:\n----------------------------");
        order1.printbill();
        order2.printbill();
    }

    static class cafeOrder {
        private final String item;
        private final double price;
        private final int quantity;

        cafeOrder(String item, double price) {
            this(item, price, 1);
        }

        cafeOrder(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        void printbill() {
            System.out.printf("%s x%d: %.2f%n", item, quantity, price * quantity);
        }
    }
}
