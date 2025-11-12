import java.util.*;
class Cart<T> {
    List<T> items = new ArrayList<>();
    void addItem(T item) { items.add(item); }
    void removeItem(T item) { items.remove(item); }
    void displayItems() { for (T i : items) System.out.println(i); }
    public static void main(String[] args) {
        Cart<String> electronicsCart = new Cart<>();
        electronicsCart.addItem("Laptop");
        electronicsCart.addItem("Mobile");
        electronicsCart.displayItems();
        Cart<String> clothingCart = new Cart<>();
        clothingCart.addItem("Shirt");
        clothingCart.addItem("Jeans");
        clothingCart.displayItems();
    }
}