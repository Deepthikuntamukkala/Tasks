package collections;

import java.util.*;
public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();

        // Adding integers (including duplicates)
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20); // Duplicate

        // Print the TreeSet
        System.out.println("Sorted TreeSet: " + numbers);
    }
}





