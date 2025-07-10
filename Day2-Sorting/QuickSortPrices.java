import java.util.*;

public class QuickSortPrices {
    public static void main(String[] args) {
        int[] prices = {700, 300, 600, 200, 500};
        quickSort(prices, 0, prices.length - 1);
        System.out.println("sorted product prices: " + Arrays.toString(prices));
    }
    
    static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for(int j=low; j<high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        
        return i+1;
    }
}

