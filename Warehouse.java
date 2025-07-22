import java.util.*;

abstract class WarehouseItem {
    private String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }

    public static void showItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem i : items) {
            System.out.println(i.getName());
        }
    }
}
public class Warehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Smartphone"));
        electronicsStorage.addItem(new Electronics("Laptop"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage.showItems(electronicsStorage.getItems());
        Storage.showItems(groceriesStorage.getItems());
    }
}
