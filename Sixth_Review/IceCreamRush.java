package Sixth_Review;
// import java.util.*;
import java.util.Scanner;

class Flavour {
    String name;
    int sales;

    public Flavour(String n, int s) {
        name = n;
        sales = s;
    }
}

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flavour[] flvr = new Flavour[8];
        flvr[0] = new Flavour("vanilla", 0);
        flvr[1] = new Flavour("Chocolate", 0);
        flvr[2] = new Flavour("Strawberry", 0);
        flvr[3] = new Flavour("Mango", 0);
        flvr[4] = new Flavour("Butterscotch", 0);
        flvr[5] = new Flavour("Coffee", 0);
        flvr[6] = new Flavour("Pan", 0);
        flvr[7] = new Flavour("Pista", 0);

        System.out.println("Enter week sales for all flavours");

        for (int i = 0; i < 8; i++) {
            System.out.print("how many sold for " + flvr[i].name + ": ");
            flvr[i].sales = sc.nextInt();
        }
        for (int i = 0; i < flvr.length - 1; i++) {
            for (int j = 0; j < flvr.length - i - 1; j++) {
                if (flvr[j].sales < flvr[j + 1].sales) {
                    Flavour temp = flvr[j];
                    flvr[j] = flvr[j + 1];
                    flvr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nFlavours sorted by popularity-");
        for (int i = 0; i < 8; i++) {
            System.out.println(flvr[i].name + " sold " + flvr[i].sales);
        }

        sc.close();
    }
}



// IceCreamRush- Sorting Flavours by popularity
// Story: At "IceCreamRush," a small local vendor sells 8 different ice cream flavors. At the end of each week, the shopkeeper wants to sort these flavors based on how many times each was sold. Since the list is short and he updates it manually, he prefers a simple sorting method -Bubble Sort where he repeatedly compares adjacent sales figures and swaps them if needed.

// Concepts Involved:

// Bubble Sort

// Small data size

// Repeated adjacent comparisons
// Task: Implement a method to sort the sales figures of ice cream flavors using Bubble Sort. The method should take an array of integers representing the number of sales for each flavor and return the sorted array in ascending order.


