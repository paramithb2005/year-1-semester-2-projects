class CafeOrder {
    private String itemName;
    private double unitPrice;
    private int quantity;
    private double total;

    public CafeOrder(String itemName, double unitPrice) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = 1;
        this.total = this.unitPrice * this.quantity;
    }
    public CafeOrder(String itemName, double unitPrice, int quantity) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.total = this.unitPrice * this.quantity;
    }
    public void printbill() {
        System.out.println("Item: " + this.itemName);
        System.out.println("Unit Price: $" + this.unitPrice);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Total: $" + this.total);
    }
    
}