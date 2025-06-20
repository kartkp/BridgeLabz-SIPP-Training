package EXTRAS_java_string_handling;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words)
            result.append(w.equals(oldWord) ? newWord : w).append(" ");
        System.out.println("Modified: " + result.toString().trim());
    }
}

