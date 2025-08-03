package collections;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();

        // Adding 5 elements
        languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");

        // Remove 2nd element (index 1 -> "C")
        languages.remove(1);

        // Print all elements
        System.out.println(languages);  
    }
}

	
