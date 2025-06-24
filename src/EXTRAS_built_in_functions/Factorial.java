package EXTRAS_built_in_functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial of " + n + " = " + factorial(n));
    }

    static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}