import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "Veg Item Discount: 5%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 50;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.03;
    }

    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 3%";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        VegItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        order.add(veg);
        order.add(nonVeg);

        for (FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();

            if (item instanceof Discountable) {
                Discountable dis = (Discountable) item;
                double discount = dis.applyDiscount();
                System.out.println(dis.getDiscountDetails());
                totalPrice -= discount;
            }

            System.out.println("Final Price after discount (if any): " + totalPrice);
            System.out.println();
        }
    }
}