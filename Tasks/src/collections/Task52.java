package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class S {
    String name;
    int marks;

    public S(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Task52 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Charlie", 90));
        students.add(new Student("Bob", 72));
        students.add(new Student("Alice", 85));
        students.add(new Student("David", 68));

        System.out.println("Before sorting by name:");
        for (Student s : students) {
            System.out.println(s);
        }

       
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.name.compareToIgnoreCase(s2.name); 
            }
        });

        System.out.println("\nAfter sorting by name (alphabetically):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

