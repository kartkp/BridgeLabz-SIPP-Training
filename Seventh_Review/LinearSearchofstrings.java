package Seventh_Review;

public class LinearSearchofstringswords {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";
        int index = linearSearch(words, target);

        if (index != -1) {
            System.out.println("Found " + target + " at index: " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
    