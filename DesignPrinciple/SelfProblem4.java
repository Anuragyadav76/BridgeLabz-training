package DesignPrinciple;
import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void show() {
        System.out.println(name + " - Rs." + price);
    }
}

class Order {
    int orderId;
    List<Product> products = new ArrayList<>();

    Order(int orderId) {
        this.orderId = orderId;
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            p.show();
        }
    }
}

class CustomerE {
    String name;
    List<Order> orders = new ArrayList<>();

    CustomerE(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed order " + o.orderId);
    }

    void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrder();
        }
    }
}

public class SelfProblem4 {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        CustomerE c1 = new CustomerE("Anurag");
        c1.placeOrder(o1);

        c1.showOrders();
    }
}
