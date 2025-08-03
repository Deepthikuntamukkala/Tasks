package collections;

import java.util.*;

class S2 {
    String name;
    int marks;

    public S2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Task55 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 85),
            new Student("Bob", 72),
            new Student("Charlie", 90),
            new Student("David", 68),
            new Student("Eve", 95),
            new Student("Frank", 80)
        );

        PriorityQueue<Student> maxHeap = new PriorityQueue<>(
            (s1, s2) -> Integer.compare(s2.marks, s1.marks)  
        );
        maxHeap.addAll(students);

        System.out.println("Top 3 highest scoring students:");
        for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
            System.out.println(maxHeap.poll());
        }
    }
}