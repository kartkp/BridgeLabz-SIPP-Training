package LambdaExpressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String n, double p, double r, double d) {
        name = n; price = p; rating = r; discount = d;
    }

    public String toString() {
        return name + " [₹" + price + ", Rating: " + rating + ", Discount: " + discount + "%]";
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 20000, 4.5, 10),
            new Product("Laptop", 60000, 4.8, 20),
            new Product("Headphones", 2000, 4.2, 15)
        );
        products.sort((a, b) -> Double.compare(a.price, b.price));
        System.out.println("\nSorted by Price: " + products);
        products.sort((a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating: " + products);

   
        products.sort((a, b) -> Double.compare(b.discount, a.discount));
        System.out.println("\nSorted by Discount: " + products);
    }
}
