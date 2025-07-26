import java.util.*;
import java.util.stream.*;

public class Program27 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anjali", "Vijay", "Geeta", "Ayan", "Raju", "Ankith", "Tarun");

        System.out.println("All names:");
        names.forEach(name -> System.out.println(name));

        System.out.println("\nNames starting with 'A':");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        System.out.println("\nNames Sorted Alphabetically:");
        names.stream()
             .sorted()
             .forEach(System.out::println);
    }
}
