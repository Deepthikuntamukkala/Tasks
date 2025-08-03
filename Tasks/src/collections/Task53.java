package collections;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task53 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("David", "Finance"));
        employees.add(new Employee("Eve", "IT"));

        Map<String, List<Employee>> deptMap = new HashMap<>();

        for (Employee emp : employees) {
            deptMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}