import java.util.Stack;

public class StockSpan {
    public static void calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        
        s.push(0);
        span[0] = 1;
        
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && prices[i] >= prices[s.peek()]) {
                s.pop();
            }
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
            s.push(i);
        }
        
        for (int sp : span) {
            System.out.print(sp + " ");
        }
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        calculateSpan(prices);
    }
}
