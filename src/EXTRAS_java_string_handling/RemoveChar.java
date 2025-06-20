package EXTRAS_java_string_handling;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char rm = sc.nextLine().charAt(0);
        String res = "";
        for (char ch : str.toCharArray()) if (ch != rm) res += ch;
        System.out.println("Modified: " + res);
    }
}

