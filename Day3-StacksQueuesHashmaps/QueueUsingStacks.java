import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> stackNewest = new Stack<>();
    Stack<Integer> stackOldest = new Stack<>();

    public void enqueue(int value) {
        stackNewest.push(value);
    }

    public int dequeue() {
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
        if (stackOldest.isEmpty()) {
            System.out.println("Queue empty");
            return -1;
        }
        return stackOldest.pop();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(40);
        System.out.println(q.dequeue());
    }
}
