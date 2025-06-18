import java.util.Scanner;
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0, value;
        do {
            System.out.print("Enter a number (0 to stop): ");
            value = sc.nextDouble();
            total += value;
        } while (value != 0);
        System.out.println("Total sum: " + total);
    }
}