package Collections.Maps;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap of Integer key and String value
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Display the LinkedHashMap
        System.out.println("LinkedHashMap: " + map); // Output: LinkedHashMap: {1=One, 2=Two, 3=Three}

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2)); // Output: Value for key 2: Two

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the map:"); // Output: Iterating through the map:
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
       // Output:
//        Key: 1, Value: One
//        Key: 2, Value: Two
//        Key: 3, Value: Three

        // Removing an element
        map.remove(3);
        System.out.println("LinkedHashMap after removal: " + map); // Output: LinkedHashMap after removal: {1=One, 2=Two}
    }
}