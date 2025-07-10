import java.util.Stack;

public class SortStackRecursively {

    public static void sortStack(Stack<Integer> stk) {
        if (!stk.isEmpty()) {
            int top = stk.pop();
            sortStack(stk);
            insertSorted(stk, top);
        }
    }

    public static void insertSorted(Stack<Integer> stk, int elem) {
        if (stk.isEmpty() || elem > stk.peek()) {
            stk.push(elem);
        } else {
            int temp = stk.pop();
            insertSorted(stk, elem);
            stk.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(30);
        stk.push(10);
        stk.push(50);
        stk.push(20);

        sortStack(stk);

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }
    }
}
