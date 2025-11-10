package InstanceofOperator;

class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void displayDetails() {
        if (this instanceof Product) {
            double total = price * quantity;
            double finalPrice = total - (total * discount / 100);
            System.out.println("ProductID: " + productID + ", Name: " + productName + ", Price: " + price + ", Qty: " + quantity + ", Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Mobile", 20000, 2);
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(20);
        p1.displayDetails();
    }
}
