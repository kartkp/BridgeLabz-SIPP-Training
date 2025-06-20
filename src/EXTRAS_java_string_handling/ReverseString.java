package EXTRAS_java_string_handling;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        System.out.println("Reversed: " + rev);
    }
}
