package collections;

import java.util.ArrayList;
import java.util.Collections;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> numbers = new ArrayList<>();

	        numbers.add(25);
	        numbers.add(10);
	        numbers.add(40);
	        numbers.add(5);
	        numbers.add(30);

	        Collections.sort(numbers);
	        System.out.println("Ascending: " + numbers); // [5, 10, 25, 30, 40]

	        
	        Collections.sort(numbers, Collections.reverseOrder());
	        System.out.println("Descending: " + numbers); // [40, 30, 25, 10, 5]
	

	}

}
