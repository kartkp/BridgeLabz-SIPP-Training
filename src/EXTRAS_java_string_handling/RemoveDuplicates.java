package EXTRAS_java_string_handling;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), res = "";
        for (char ch : str.toCharArray())
            if (res.indexOf(ch) == -1) res += ch;
        System.out.println("No Duplicates: " + res);
    }
}

