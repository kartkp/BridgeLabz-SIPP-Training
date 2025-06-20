package EXTRAS_java_string_handling;

import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) freq[ch]++;
        char maxChar = ' ';
        int max = 0;
        for (char ch : str.toCharArray())
            if (freq[ch] > max) {
                max = freq[ch];
                maxChar = ch;
            }
        System.out.println("Most Frequent: " + maxChar);
    }
}

