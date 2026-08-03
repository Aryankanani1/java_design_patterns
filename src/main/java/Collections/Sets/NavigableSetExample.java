package Collections.Sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        // Create a NavigableSet of String type using TreeSet
        NavigableSet<String> words = new TreeSet<>();

        // Adding elements to the NavigableSet
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");

        // Display the NavigableSet
        System.out.println("Words: " + words); // Output: Words: [Apple, Banana, Cherry, Date]

        // Accessing elements with methods specific to NavigableSet
        System.out.println("First word: " + words.first()); // Output: First word: Apple
        System.out.println("Last word: " + words.last()); // Output: Last word: Date

        System.out.println("Lower than 'Banana': " + words.lower("Banana")); // Output: Lower than 'Banana': Apple
        System.out.println("Higher than 'Banana': " + words.higher("Banana")); // Output: Higher than 'Banana': Cherry

        // Iterating through the NavigableSet
        System.out.println("Iterating through the set:"); // Output: Iterating through the set:
        for (String word : words) {
            System.out.println(word);
        }
       // Output:
//        Apple
//        Banana
//        Cherry
//        Date


        // Removing an element
        words.remove("Date");
        System.out.println("Words after removal: " + words); // Output: Words after removal: [Apple, Banana, Cherry]
    }
}