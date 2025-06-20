package EXTRAS_java_string_handling;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println("Longest: " + longest);
    }
}

