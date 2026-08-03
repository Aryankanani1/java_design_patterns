package Collections.Iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorExample {
    public static void main(String[] args) {
        // Create a set of strings
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Obtain an Iterator
        Iterator<String> iterator = set.iterator();

        // Traverse the set
        System.out.println("Traversing the set:"); // Output: Traversing the set:
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
        // Output:
//        Element: Apple
//        Element: Cherry
//        Element: Date
//        Element: Elderberry
//        Element: Banana
    }
}