package JavaExceptionHandling;

import java.util.*;

public class MultipleCatch {
    public static void main(String[] args) {
        int[] arr = null;
        Scanner sc = new Scanner(System.in);

        
        try {
            arr = new int[]{10, 20, 30, 40};
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
