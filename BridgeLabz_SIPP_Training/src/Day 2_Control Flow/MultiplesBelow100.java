import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0 && number < 100) {
            int counter = number - 1;
            while (counter > 1) {
                if (100 % counter == 0)
                    System.out.println(counter);
                counter--;
            }
        } else {
            System.out.println("Enter a number between 1 and 99");
        }
    }
}