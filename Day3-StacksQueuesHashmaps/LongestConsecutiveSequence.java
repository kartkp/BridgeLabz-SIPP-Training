import java.util.*;

public class LongestConsecutiveSequence {
    public static int findLongestSeq(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int maxLen = 0;
        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int curr = n;
                int len = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest sequence length: " + findLongestSeq(arr));
    }
}
