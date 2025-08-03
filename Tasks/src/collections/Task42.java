package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task42 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Forward Traversal:");
        ListIterator<String> listIterator = fruits.listIterator();

        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("\nBackward Traversal:");
        while (listIterator.hasPrevious()) {
            String fruit = listIterator.previous();
            System.out.println(fruit);
        }
    }
}
