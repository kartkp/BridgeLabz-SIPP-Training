package Day4_Methods;

import java.util.*;

public class NumberChecker {

    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int temp = num, sum = 0;
        while (temp > 0) {
            int d = temp % 10, fact = 1;
            for (int i = 1; i <= d; i++) fact *= i;
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}

