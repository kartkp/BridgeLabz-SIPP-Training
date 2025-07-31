package JavaStreams;

import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Map<String, Integer> freq = new HashMap<>();
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\W+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    word = word.toLowerCase();
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }
            }
        }
        reader.close();

        freq.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .limit(5)
            .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}

