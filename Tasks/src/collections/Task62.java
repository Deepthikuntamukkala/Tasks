package collections;

import java.util.*;
import java.util.stream.Collectors;

public class Task62 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> squared = numbers.stream()
                                       .map(n -> n * n)
                                       .collect(Collectors.toList());

        System.out.println("Original: " + numbers);
        System.out.println("Squared: " + squared);
    }
}