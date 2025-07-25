package JavaCollections.InsurancePolicyManagementSystemMap;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Laptop", 60000.0);
        prices.put("Mouse", 500.0);
        prices.put("Keyboard", 1500.0);

        LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Mouse", 2);
        cart.put("Laptop", 1);
        cart.put("Keyboard", 1);

        TreeMap<Double, String> sortedItems = new TreeMap<>();
        for (String item : cart.keySet()) {
            sortedItems.put(prices.get(item), item);
        }

        System.out.println("--- Cart Items Sorted by Price ---");
        for (Map.Entry<Double, String> entry : sortedItems.entrySet()) {
            System.out.println(entry.getValue() + " -> " + entry.getKey());
        }
    }
}
