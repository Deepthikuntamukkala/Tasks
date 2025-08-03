package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(4, "D");
        hashMap.put(2, "B");
        
        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("Sorted TreeMap by keys:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	   }
   }

}
