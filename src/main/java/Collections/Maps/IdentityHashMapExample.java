package Collections.Maps;

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        // Create an IdentityHashMap of Integer key and String value
        IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

        // Adding elements to the IdentityHashMap
        Integer key1 = new Integer(1);
        Integer key2 = new Integer(1);
        map.put(key1, "One");
        map.put(key2, "One");

        // Display the IdentityHashMap
        System.out.println("IdentityHashMap: " + map); // Output: IdentityHashMap: {1=One, 1=One}

        // Accessing elements
        System.out.println("Value for key1: " + map.get(key1)); // Output: Value for key1: One
        System.out.println("Value for key2: " + map.get(key2)); // Output: Value for key2: One

        // Iterating through the IdentityHashMap
        System.out.println("Iterating through the map:"); // Output: Iterating through the map:
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        // Output:
        // Key: 1, Value: One
        // Key: 1, Value: One


        // Removing an element
        map.remove(key1);
        System.out.println("IdentityHashMap after removal: " + map); // Output: IdentityHashMap after removal: {1=One}
    }
}