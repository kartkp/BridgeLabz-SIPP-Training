import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum > number)
            System.out.println(number + " is an Abundant Number");
        else
            System.out.println(number + " is not an Abundant Number");
    }
}