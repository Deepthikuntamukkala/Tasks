package collections;

import java.util.*;
import java.util.stream.Collectors;

class Emp11 {
    String name;
    String department;

    public Emp11(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task63 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Finance"),
            new Employee("Eve", "IT")
        );

        Map<String, List<Employee>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(emp -> emp.department));

        groupedByDept.forEach((dept, emps) -> {
            System.out.println(dept + ": " + emps);
        });
    }
}
