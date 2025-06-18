import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, i = 1;
        if (n > 0) {
            while (i <= n) {
                sum += i++;
            }
            int formula = n * (n + 1) / 2;
            System.out.println("While loop sum: " + sum);
            System.out.println("Formula sum: " + formula);
            System.out.println("Results match? " + (sum == formula));
        } else {
            System.out.println("Enter a natural number!");
        }
    }
}