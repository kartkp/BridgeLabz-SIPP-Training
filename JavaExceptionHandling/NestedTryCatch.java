package JavaExceptionHandling;

import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30};

        try {
            System.out.print("Enter index: ");
            int index = sc.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();
                int result = arr[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}

