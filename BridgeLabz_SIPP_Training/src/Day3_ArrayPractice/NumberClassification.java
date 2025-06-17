package Day3_ArrayPractice;

public class NumberClassification {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        for (int num : nums) {
            if (num > 0) {
                if (num % 2 == 0) System.out.println(num + " is positive and even");
                else System.out.println(num + " is positive and odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (nums[0] == nums[4]) {
            System.out.println("First and last elements are equal");
        } else if (nums[0] > nums[4]) {
            System.out.println("First element is greater than last");
        } else {
            System.out.println("First element is less than last");
        }
        sc.close();
    }
}