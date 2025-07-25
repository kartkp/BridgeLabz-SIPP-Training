package JavaCollections.QueueInterface;

import java.util.*;

public class GenerateBinaryNumbers {
    public static void generateBinaryNumbers(int N) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < N; i++) {
            String front = q.remove();
            System.out.print(front + " ");
            q.add(front + "0");
            q.add(front + "1");
        }
    }

    public static void main(String[] args) {
        generateBinaryNumbers(5);
    }
}

