import java.util.*;

public class HeapSortSalary {
    public static void main(String[] args) {
        int[] salaries = {30000, 45000, 25000, 50000, 40000};
        heapSort(salaries);
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
    
    static void heapSort(int[] arr) {
        int n = arr.length;
        
        for(int i=n/2 - 1; i>=0; i--)
            heapify(arr, n, i);
        
        for(int i=n-1; i>=0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }
    
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
        
        if(l < n && arr[l] > arr[largest])
            largest = l;
        if(r < n && arr[r] > arr[largest])
            largest = r;
        
        if(largest != i) {
            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            
            heapify(arr, n, largest);
        }
    }
}

