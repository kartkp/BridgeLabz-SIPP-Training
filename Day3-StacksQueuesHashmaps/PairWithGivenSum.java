import java.util.*;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                System.out.println("Pair found: " + num + ", " + (target - num));
                return true;
            }
            seen.add(num);
        }
        System.out.println("No pair found");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        hasPair(arr, target);
    }
}
