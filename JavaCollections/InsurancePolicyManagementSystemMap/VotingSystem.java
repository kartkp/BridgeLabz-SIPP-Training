package JavaCollections.InsurancePolicyManagementSystemMap;

import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        votes.put("Alice", 5);
        votes.put("Bob", 3);
        votes.put("Carol", 7);

        TreeMap<String, Integer> sortedVotes = new TreeMap<>(votes);
        System.out.println("--- Sorted Votes (TreeMap) ---");
        sortedVotes.forEach((candidate, voteCount) -> System.out.println(candidate + ": " + voteCount));

        LinkedHashMap<String, Integer> orderedVotes = new LinkedHashMap<>();
        orderedVotes.put("Alice", 5);
        orderedVotes.put("Bob", 3);
        orderedVotes.put("Carol", 7);
        System.out.println("--- Ordered Votes (LinkedHashMap) ---");
        orderedVotes.forEach((candidate, voteCount) -> System.out.println(candidate + ": " + voteCount));
    }
}
