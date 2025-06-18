package Day4_Methods;

import java.util.*;

public class NaturalSum {

    public static int sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number.");
            return;
        }
        int recSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Recursive Sum: " + recSum);
        System.out.println("Formula Sum: " + formulaSum);
    }
}
