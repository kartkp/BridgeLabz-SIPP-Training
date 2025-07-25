package JavaCollections.MapInterface;
import java.util.*;

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ali", "HR"),
                new Employee("Bobita", "IT"),
                new Employee("Camal", "HR")
        );

        Map<String, List<Employee>> grouped = new HashMap<>();

        for (Employee emp : employees) {
            grouped.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
