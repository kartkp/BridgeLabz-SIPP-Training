package JavaCollections;

import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                System.out.println("N is larger than list size");
                return;
            }
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        if (slow.hasNext()) {
            System.out.println(slow.next());
        }
    }
}
