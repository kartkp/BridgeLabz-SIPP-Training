import java.util.*;

public class SlidingWindowMax {
    public static List<Integer> maxInWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                result.add(nums[dq.peek()]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        List<Integer> maxes = maxInWindow(arr, 3);
        System.out.println(maxes);
    }
}
