package Day3_ArrayPractice;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int i = 0;
        while (num != 0) {
            digits[i++] = num % 10;
            num /= 10;
        }

        System.out.print("Reversed number: ");
        for (int d : digits)
            System.out.print(d);
        sc.close();
    }
}
