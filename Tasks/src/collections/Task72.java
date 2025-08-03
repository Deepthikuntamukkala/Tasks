package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Task72 {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");
        languages.add("Java");

        // Count the frequency of "Java"
        int count = Collections.frequency(languages, "Java");

        // Display the result
        System.out.println("Frequency of 'Java': " + count);
    }
}
