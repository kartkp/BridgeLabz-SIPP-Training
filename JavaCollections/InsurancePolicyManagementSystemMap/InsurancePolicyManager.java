package JavaCollections.InsurancePolicyManagementSystemMap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    Map<String, InsurancePolicy> hashMap = new HashMap<>();
    Map<String, InsurancePolicy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<LocalDate, List<InsurancePolicy>> treeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.computeIfAbsent(policy.getExpiryDate(), k -> new ArrayList<>()).add(policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public void listPoliciesExpiringInNext30Days() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        System.out.println("--- Policies Expiring in 30 Days ---");
        treeMap.subMap(today, true, limit, true)
                .values()
                .stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    public void listPoliciesByHolder(String holder) {
        System.out.println("--- Policies for: " + holder + " ---");
        linkedHashMap.values().stream()
                .filter(policy -> policy.getPolicyholderName().equalsIgnoreCase(holder))
                .forEach(System.out::println);
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        List<String> expiredPolicies = new ArrayList<>();

        for (var entry : hashMap.entrySet()) {
            if (entry.getValue().getExpiryDate().isBefore(today)) {
                expiredPolicies.add(entry.getKey());
            }
        }
        expiredPolicies.forEach(k -> {
            hashMap.remove(k);
            linkedHashMap.remove(k);
        });
        treeMap.headMap(today).clear();
        System.out.println("--- Expired Policies Removed ---");
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000));
        manager.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.now().minusDays(5), "Home", 6000));

        System.out.println(manager.getPolicyByNumber("P001"));

        manager.listPoliciesExpiringInNext30Days();
        manager.listPoliciesByHolder("Alice");

        manager.removeExpiredPolicies();
        manager.listPoliciesExpiringInNext30Days();
    }
}
