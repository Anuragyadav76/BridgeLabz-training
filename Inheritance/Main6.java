class Order {
    int orderId;
    String orderDate;
}

class ShippedOrder extends Order {
    String trackingNumber;
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " | Shipped: " + trackingNumber + " | Delivered: " + deliveryDate);
    }
}

public class Main6 {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder();
        d.orderId = 101;
        d.orderDate = "10 Nov";
        d.trackingNumber = "TR1234";
        d.deliveryDate = "12 Nov";
        d.getOrderStatus();
    }
}
