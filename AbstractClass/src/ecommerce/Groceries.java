package ecommerce;

public class Groceries extends Product implements Taxable {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.02;
    }

    @Override
    public String getTaxDetails() {
        return "2% GST applied on Groceries.";
    }
}
