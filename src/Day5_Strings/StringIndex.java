package Day5_Strings;

import java.util.*;

public class StringIndex {

    public static void generateException(String text) {
        char ch = text.charAt(10);
        System.out.println("Char: " + ch);
    }

    public static void handleException(String text) {
        try {
            char ch = text.charAt(10);
            System.out.println("Char: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index too far.");
        } catch (RuntimeException e) {
            System.out.println("something went wrong.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        try {
            generateException(input);
        } catch (Exception e) {
            System.out.println("caught in main: " + e);
        }

        handleException(input);
    }
}

