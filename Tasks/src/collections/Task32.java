package collections;

import java.util.HashMap;
public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "hello";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        
        System.out.println(freqMap);

	}

}
