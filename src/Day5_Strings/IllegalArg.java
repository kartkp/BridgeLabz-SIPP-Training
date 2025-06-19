package Day5_Strings;

import java.util.*;

public class IllegalArg {

    public static void generateException(String text) {
        String sub = text.substring(5, 2);
        System.out.println("Substr: " + sub);
    }

    public static void handleException(String text) {
        try {
            String sub = text.substring(5, 2);
            System.out.println("Substr: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid indexes used.");
        } catch (RuntimeException e) {
            System.out.println("Some error happened.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
        }

        handleException(input);
    }
}

