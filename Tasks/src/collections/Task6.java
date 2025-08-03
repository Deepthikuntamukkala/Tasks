package collections;

import java.util.*;
import java.util.stream.Collectors;

public class Task6{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Jack", "Bob", "jenny", "Jill");

        // Filter names starting with "J"
        List<String> jNames = names.stream()
                                   .filter(name -> name.startsWith("J"))
                                   .collect(Collectors.toList());

        System.out.println("Names starting with 'J': " + jNames);
    }
}