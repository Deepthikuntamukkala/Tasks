package filehandling;

import java.io.*;
import java.util.*;
class Student0 implements Serializable {
String name;
int roll;
Student0(String n, int r) {
name = n;
roll = r;
}
}
public class Task10 {
public static void main(String[] args) throws Exception {
ArrayList<Student0> list = new ArrayList<>();
list.add(new Student0("A", 1));
list.add(new Student0("B", 2));
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.ser"));
oos.writeObject(list);
oos.close();
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.ser"));
ArrayList<Student0> students = (ArrayList<Student0>) ois.readObject();
ois.close();
for (Student0 s : students)
System.out.println(s.name + " - " + s.roll);
}
}