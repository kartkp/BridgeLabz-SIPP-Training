public class SumUntilNegative {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            int num = sc.nextInt();

            if (num < 0) {
                break;
            }

            sum += num;
        }

        System.out.println("Sum of entered numbers: " + sum);
        sc.close();
    }
}
