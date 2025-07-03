package Java_Class_and_Object.Level1;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: ₹" + price);
    }

    public static void main(String[] args) {
        Item item = new Item(501, "Notebook", 55.0);
        item.displayDetails();
        System.out.println("Total cost for 10 units: ₹" + item.calculateTotalCost(10));
    }
}
