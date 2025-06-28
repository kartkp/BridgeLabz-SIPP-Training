package Java_ObjectModeling;

import java.util.ArrayList;

class Product {
    String name;
    double price;
    Product(String n, double p) { name = n; price = p; }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) {
        products.add(p);
    }
}
class Customer {
    String name;
    Customer(String n) { name = n; }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order with " + o.products.size() + " products.");
    }
}

public class TestEcommerce {
    public static void main(String[] args) {
        Customer c = new Customer("Kiran");
        Order o = new Order();
        o.addProduct(new Product("Laptop", 70000));
        o.addProduct(new Product("Mouse", 500));

        c.placeOrder(o);
    }
}