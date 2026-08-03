package Collections.Maps;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap of Integer key and String value
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Display the HashMap
        System.out.println("HashMap: " + map); // Output: HashMap: {1=One, 2=Two, 3=Three}

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2)); // Output: Value for key 2: Two

        // Iterating through the HashMap
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
        System.out.println("HashMap after removal: " + map); // Output: HashMap after removal: {1=One, 2=Two}
    }
}