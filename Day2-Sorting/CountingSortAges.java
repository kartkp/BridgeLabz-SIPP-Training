import java.util.*;

public class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 11, 15, 13, 10, 12};
        int maxAge = 18;
        int minAge = 10;
        int range = maxAge - minAge + 1;
        
        int[] count = new int[range];
        int[] output = new int[ages.length];
        
        for(int age : ages) {
            count[age - minAge]++;
        }
        
        for(int i=1; i<range; i++) {
            count[i] += count[i-1];
        }
        
        for(int i=ages.length - 1; i>=0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }
        
        System.out.println("sorted student ages: " + Arrays.toString(output));
    }
}
