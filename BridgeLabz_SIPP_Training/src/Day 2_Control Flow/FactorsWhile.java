import java.util.Scanner;
public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), counter = 1;
        if (number > 0) {
            while (counter <= number) {
                if (number % counter == 0)
                    System.out.println(counter);
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}