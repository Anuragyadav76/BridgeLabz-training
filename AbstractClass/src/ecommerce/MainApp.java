package ecommerce;

public class MainApp {
    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "T-Shirt", 1200);
        Product p3 = new Groceries(103, "Rice Bag", 800);

        Product[] products = { p1, p2, p3 };

        System.out.println("=== E-Commerce Product Details ===");

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = ((Taxable) p).calculateTax();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount: ₹" + discount);
            System.out.println(((Taxable) p).getTaxDetails());
            System.out.println("Tax: ₹" + tax);
            System.out.println("Final Price after Tax & Discount: ₹" + finalPrice);
            System.out.println("---------------------------------------");
        }
    }
}
