package JavaCollections.InsurancePolicyManagementSystemMap;

import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC001", 5000.0);
        accounts.put("ACC002", 8000.0);
        accounts.put("ACC003", 3000.0);

        TreeMap<Double, String> sortedAccounts = new TreeMap<>();
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }

        System.out.println("--- Accounts Sorted by Balance ---");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println(entry.getValue() + " -> " + entry.getKey());
        }

        Queue<String> withdrawalRequests = new LinkedList<>();
        withdrawalRequests.add("ACC001");
        withdrawalRequests.add("ACC002");

        System.out.println("--- Processing Withdrawals ---");
        while (!withdrawalRequests.isEmpty()) {
            String acc = withdrawalRequests.poll();
            System.out.println("Processed withdrawal for: " + acc);
        }
    }
}
