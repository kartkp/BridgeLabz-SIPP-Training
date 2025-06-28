package Second_Review;

import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter coffee type (espresso/latte/cappuccino) or 'exit' to stop: ");
            String coffeeType = sc.next();
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closing. Goodbye!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int price = 0;
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }
            int total = price * quantity;
            double gst = total * 0.18;
            double grandTotal = total + gst;

            System.out.println("Total: " + total);
            System.out.println("GST (18%): " + gst);
            System.out.println("Grand Total: " + grandTotal);
            // System.out.println("----------------------------------");
        }
        sc.close();
    }
}
