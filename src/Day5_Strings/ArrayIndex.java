package Day5_Strings;

import java.util.*;

public class ArrayIndex {

    public static void generateException(String[] names) {
        System.out.println("Accessing index 5: " + names[5]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing index 5: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops! Index is too big.");
        } catch (RuntimeException e) {
            System.out.println("Something went wrong.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
        }

        handleException(names);
    }
}

