import java.util.*;

public class SelectionSortScores {
    public static void main(String[] args) {
        int[] scores = {88, 70, 95, 60, 80};
        
        for(int i=0; i<scores.length-1; i++) {
            int minIdx = i;
            for(int j=i+1; j<scores.length; j++) {
                if(scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = tmp;
        }
        
        System.out.println("sorted exam scores: " + Arrays.toString(scores));
    }
}

