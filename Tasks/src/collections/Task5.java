package collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Implement compareTo to sort by marks (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 68));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Comparable
        Collections.sort(students);

        System.out.println("\nAfter sorting by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
