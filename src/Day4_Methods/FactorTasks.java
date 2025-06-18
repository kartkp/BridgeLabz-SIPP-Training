package Day4_Methods;

import java.util.*;

public class FactorTasks {

    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] arr = new int[count];
        int k = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) arr[k++] = i;
        return arr;
    }

    public static int greatestFactor(int[] f) {
        int max = f[0];
        for (int i : f) if (i > max) max = i;
        return max;
    }

    public static int sumFactors(int[] f) {
        int sum = 0;
        for (int i : f) sum += i;
        return sum;
    }

    public static int productFactors(int[] f) {
        int prod = 1;
        for (int i : f) prod *= i;
        return prod;
    }

    public static double productCubeFactors(int[] f) {
        double prod = 1;
        for (int i : f) prod *= Math.pow(i, 3);
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] f = getFactors(num);
        System.out.println("Factors: " + Arrays.toString(f));
        System.out.println("Greatest: " + greatestFactor(f));
        System.out.println("Sum: " + sumFactors(f));
        System.out.println("Product: " + productFactors(f));
        System.out.println("Cube Product: " + productCubeFactors(f));
    }
}
