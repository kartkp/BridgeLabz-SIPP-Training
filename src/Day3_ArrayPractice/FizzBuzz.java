package Day3_ArrayPractice;

public class FizzBuzz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        String[] result = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result[i] = "FizzBuzz";
            else if (i % 3 == 0) result[i] = "Fizz";
            else if (i % 5 == 0) result[i] = "Buzz";
            else result[i] = Integer.toString(i);
        }

        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
        sc.close();
    }
}