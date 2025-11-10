package Object.Leveltwo;


class CartItem {
    String itemName;
    double price;
    int quantity;

    public void addItem(String name, double cost, int qty) {
        itemName = name;
        price = cost;
        quantity = qty;
        System.out.println(qty + " " + name + " added to cart.");
    }

    public void removeItem() {
        System.out.println(itemName + " removed from cart.");
        itemName = null;
        price = 0;
        quantity = 0;
    }

    public void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();
        cart.addItem("Shoes", 2000, 2);
        cart.displayTotalCost();
        cart.removeItem();
        cart.displayTotalCost();
    }
}
