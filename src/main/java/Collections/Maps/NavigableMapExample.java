package Collections.Maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        // Create a NavigableMap of String key and Integer value using TreeMap
        NavigableMap<String, Integer> map = new TreeMap<>();

        // Adding elements to the NavigableMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Display the NavigableMap
        System.out.println("NavigableMap: " + map); // Output: NavigableMap: {Apple=1, Banana=2, Cherry=3, Date=4}

        // Accessing elements with methods specific to NavigableMap
        System.out.println("First entry: " + map.firstEntry()); // Output: First entry: Apple=1
        System.out.println("Last entry: " + map.lastEntry()); // Output: Last entry: Date=4

        System.out.println("Lower than 'Banana': " + map.lowerEntry("Banana")); // Output:Lower than 'Banana': Apple=1
        System.out.println("Higher than 'Banana': " + map.higherEntry("Banana")); // Output: Higher than 'Banana': Cherry=3

        // Iterating through the NavigableMap
        System.out.println("Iterating through the map:"); // Output: Iterating through the map:
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        // Output:
//        Key: Apple, Value: 1
//        Key: Banana, Value: 2
//        Key: Cherry, Value: 3
//        Key: Date, Value: 4

        // Removing an element
        map.remove("Date");
        System.out.println("NavigableMap after removal: " + map); // Output: NavigableMap after removal: {Apple=1, Banana=2, Cherry=3}
    }
}