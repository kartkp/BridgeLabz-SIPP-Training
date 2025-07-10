import java.util.*;

public class BubbleSortMarks {
    public static void main(String[] args) {
        int[] marks = {65, 85, 45, 90, 70};
        
        for(int i=0; i<marks.length-1; i++) {
            for(int j=0; j<marks.length-i-1; j++) {
                if(marks[j] > marks[j+1]) {
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
        }
        
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
