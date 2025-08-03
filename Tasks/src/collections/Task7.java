package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Print original list
        System.out.println("Original List: " + list);

        // Reverse the list
        Collections.reverse(list);

        // Print reversed list
        System.out.println("Reversed List: " + list);
    }
}
