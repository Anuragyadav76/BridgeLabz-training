package fooddelivery;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
        else
            System.out.println("Quantity must be positive!");
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}
