package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Andrew");
        names.add("Charlie");
        names.add("Angela");

        System.out.println("Before removal: " + names);

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.toLowerCase().startsWith("a")) {
                iterator.remove();  // Safe removal using Iterator
            }
        }

        System.out.println("After removal: " + names);
    }
}
