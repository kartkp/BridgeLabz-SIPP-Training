package EXTRAS_java_string_handling;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int res = 0, len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++)
            if (s1.charAt(i) != s2.charAt(i)) {
                res = s1.charAt(i) - s2.charAt(i);
                break;
            }
        if (res == 0) res = s1.length() - s2.length();
        if (res < 0) System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\"");
        else if (res > 0) System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\"");
        else System.out.println("Both are same");
    }
}
