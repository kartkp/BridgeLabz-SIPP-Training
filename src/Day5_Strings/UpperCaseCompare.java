package Day5_Strings;

import java.util.*;

public class UpperCaseCompare {

    public static String manualUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String input = sc.nextLine();

        String builtInUpper = input.toUpperCase();
        String manualUpper = manualUpperCase(input);

        System.out.println("Built-in: " + builtInUpper);
        System.out.println("Manual  : " + manualUpper);

        boolean isSame = compareStrings(builtInUpper, manualUpper);
        System.out.println("Are both same? " + isSame);
    }
}

