import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i++;
            }
            System.out.println("Factorial: " + fact);
        } else {
            System.out.println("Enter a positive integer!");
        }
    }
}