import java.util.*;

public class CustomHashMap<K, V> {

    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;
        Entry(K k, V v) { key = k; value = v; }
    }

    private Entry<K, V>[] table;
    private int size = 16;

    public CustomHashMap() {
        table = new Entry[size];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[idx];
        table[idx] = newEntry;
    }

    public V get(K key) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];
        while (head != null) {
            if (head.key.equals(key)) return head.value;
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];
        Entry<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    table[idx] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("apple", 100);
        map.put("banana", 50);
        System.out.println("apple price: " + map.get("apple"));
        map.remove("apple");
        System.out.println("apple after removal: " + map.get("apple"));
    }
}
