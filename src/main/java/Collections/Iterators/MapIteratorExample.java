package Collections.Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteratorExample {
    public static void main(String[] args) {
        // Create a map of integer keys and string values
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        // Obtain a set of entries
        Set<Entry<Integer, String>> entrySet = map.entrySet();

        // Obtain an Iterator
        Iterator<Entry<Integer, String>> iterator = entrySet.iterator();

        // Traverse the map
        System.out.println("Traversing the map:"); // Output: Traversing the map:
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
       // Output:
//        Key: 1, Value: One
//        Key: 2, Value: Two
//        Key: 3, Value: Three
//        Key: 4, Value: Four
//        Key: 5, Value: Five
    }
}