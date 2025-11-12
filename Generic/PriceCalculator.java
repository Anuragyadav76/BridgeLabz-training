import java.util.*;
class Product {
    double price;
    Product(double price) { this.price = price; }
    double getPrice() { return price; }
}
class Mobile extends Product { Mobile(double p) { super(p); } }
class Laptop extends Product { Laptop(double p) { super(p); } }
class PriceCalculator {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }
    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(20000), new Mobile(25000));
        List<Laptop> laptops = Arrays.asList(new Laptop(50000), new Laptop(60000));
        System.out.println(calculateTotal(mobiles));
        System.out.println(calculateTotal(laptops));
    }
}