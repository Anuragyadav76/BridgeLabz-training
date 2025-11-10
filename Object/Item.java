package Object;



class Item {
    int itemCode;
    String itemName;
    double price;

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 101;
        item.itemName = "Laptop";
        item.price = 50000.0;
        item.displayItem(2);
    }
}

