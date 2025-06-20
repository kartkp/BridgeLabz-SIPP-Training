package EXTRAS_java_string_handling;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), res = "";
        for (char ch : str.toCharArray())
            res += Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        System.out.println("Toggled: " + res);
    }
}

