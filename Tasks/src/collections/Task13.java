package collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C");
        languages.add("Java");
        languages.add("Python");

        // Convert list to set to remove duplicates
        Set<String> uniqueLanguages = new HashSet<>(languages);

        // Print the set
        System.out.println("After removing duplicates: " + uniqueLanguages);
    }
}

