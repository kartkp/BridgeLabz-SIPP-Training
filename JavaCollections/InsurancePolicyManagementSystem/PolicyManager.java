package JavaCollections.InsurancePolicyManagementSystem;
import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>();

    public void addPolicy(InsurancePolicy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("--- All Policies (HashSet) ---");
        hashSet.forEach(System.out::println);
        System.out.println("--- All Policies (LinkedHashSet) ---");
        linkedHashSet.forEach(System.out::println);
        System.out.println("--- All Policies (TreeSet by Expiry Date) ---");
        treeSet.forEach(System.out::println);
    }

    public void displayPoliciesExpiringInNext30Days() {
        System.out.println("--- Policies Expiring in Next 30 Days ---");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        treeSet.stream()
                .filter(policy -> !policy.getExpiryDate().isAfter(limit))
                .forEach(System.out::println);
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("--- Policies with Coverage Type: " + coverageType + " ---");
        hashSet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    public void displayDuplicatePolicies(List<InsurancePolicy> policies) {
        System.out.println("--- Duplicate Policies by Policy Number ---");
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (InsurancePolicy policy : policies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy.getPolicyNumber());
            }
        }
        duplicates.forEach(System.out::println);
    }
}
