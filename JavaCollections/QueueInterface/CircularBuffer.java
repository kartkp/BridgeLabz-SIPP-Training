package JavaCollections.QueueInterface;

public class CircularBuffer {
    private int[] buffer;
    private int head = 0;
    private int size = 0;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }

    public void insert(int value) {
        buffer[(head + size) % capacity] = value;
        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display();
        cb.insert(4);
        cb.display();
    }
}
