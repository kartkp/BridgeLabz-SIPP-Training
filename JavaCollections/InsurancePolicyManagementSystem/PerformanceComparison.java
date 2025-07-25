package JavaCollections.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PerformanceComparison {
    public static void comparePerformance(List<InsurancePolicy> policies) {
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>();

        long start, end;

        System.out.println("\n--- Performance Comparison ---");

        start = System.nanoTime();
        hashSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");
        start = System.nanoTime();
        treeSet.addAll(policies);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        InsurancePolicy searchPolicy = policies.get(policies.size() / 2);
        start = System.nanoTime();
        hashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(searchPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.remove(searchPolicy);
        end = System.nanoTime();
        System.out.println("HashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.remove(searchPolicy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Remove: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.remove(searchPolicy);
        end = System.nanoTime();
        System.out.println("TreeSet Remove: " + (end - start) + " ns");
    }
}
