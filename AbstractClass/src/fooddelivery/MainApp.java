package fooddelivery;

public class MainApp {
    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 3);

        FoodItem[] order = { f1, f2 };

        System.out.println("=== Online Food Delivery System ===\n");

        for (FoodItem item : order) {
            item.getItemDetails();
            double total = item.calculateTotalPrice();
            double discount = ((Discountable) item).applyDiscount();
            double finalAmount = total - discount;

            System.out.println(((Discountable) item).getDiscountDetails());
            System.out.println("Total Price (before discount): ₹" + total);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Amount to Pay: ₹" + finalAmount);
            System.out.println("-------------------------------------------\n");
        }
    }
}
