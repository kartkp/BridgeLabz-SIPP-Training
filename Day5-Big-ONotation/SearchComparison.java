import java.util.Random;

public class SearchComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void testSearchPerformance(int N) {
        int[] data = new int[N];
        for (int i = 0; i < N; i++) data[i] = i;
        Random rand = new Random();
        int target = rand.nextInt(N);
        long start = System.nanoTime();
        linearSearch(data, target);
        long linearTime = (System.nanoTime() - start) / 1_000_000; // ms

        start = System.nanoTime();
        binarySearch(data, target);
        long binaryTime = (System.nanoTime() - start) / 1_000_000; // ms

        System.out.printf("N=%-10d | Linear Search: %d ms | Binary Search: %d ms\n", N, linearTime, binaryTime);
    }

    public static void main(String[] args) {
        int[] testSizes = {1000, 10000, 1_000_000};
        for (int N : testSizes) {
            testSearchPerformance(N);
        }
    }
}
