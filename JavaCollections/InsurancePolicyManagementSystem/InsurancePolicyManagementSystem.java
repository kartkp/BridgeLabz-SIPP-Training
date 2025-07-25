package JavaCollections.InsurancePolicyManagementSystem;
import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        List<InsurancePolicy> allPolicies = new ArrayList<>();

        allPolicies.add(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 5000));
        allPolicies.add(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000));
        allPolicies.add(new InsurancePolicy("P003", "Charlie", LocalDate.now().plusDays(5), "Home", 7000));
        allPolicies.add(new InsurancePolicy("P004", "David", LocalDate.now().plusDays(20), "Health", 4500));
        allPolicies.add(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 3000)); // Duplicate

        for (InsurancePolicy policy : allPolicies) {
            manager.addPolicy(policy);
        }

        manager.displayAllPolicies();
        manager.displayPoliciesExpiringInNext30Days();
        manager.displayPoliciesByCoverageType("Health");
        manager.displayDuplicatePolicies(allPolicies);

        PerformanceComparison.comparePerformance(allPolicies);
    }
}
