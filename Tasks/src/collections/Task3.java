package collections;


import java.util.HashMap;
import java.util.Map;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> studentMap = new HashMap<>();

        
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");

        studentMap.remove(103);

        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


