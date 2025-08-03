package collections;


import java.util.HashSet;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> languages = new HashSet<>();

        // Adding values, including duplicates
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");    // Duplicate
        languages.add("Python"); // Duplicate

        // Print the HashSet
        System.out.println("HashSet contents: " + languages);
    }
}

	
