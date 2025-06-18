package Day3_ArrayPractice;

public class NumberEntry {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;
        

        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) break;
            nums[index++] = input;
        }

        for (int i = 0; i < index; i++) {
            total += nums[i];
            System.out.println("Number[" + i + "] = " + nums[i]);
        }
        System.out.println("Total: " + total);
        sc.close();
    }
}