package Collections.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteratorExample {
    public static void main(String[] args) {
        // Create a HashMap of String key and Integer value
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Get the Iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterate through the map using the iterator
        System.out.println("Iterating through the map:"); // Output: Iterating through the map:
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Output:
//        Key: One, Value: 1
//        Key: Two, Value: 2
//        Key: Three, Value: 3


        // Removing elements during iteration
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("Two")) {
                iterator.remove();
            }
        }
        System.out.println("Map after removal: " + map); // Output: Map after removal: {One=1, Three=3}
    }
}