package Java_Class_and_Object.Level2;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " more added to " + itemName);
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " removed from " + itemName);
        } else {
            System.out.println("Cannot remove more than current quantity.");
        }
    }

    public void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + total);
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Bluetooth Speaker", 1299.99, 1);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}