package Day3_ArrayPractice;

public class DynamicArrayExpansion {
    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        sc.close();
    }
}