package Collections.Maps;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap of String key and Integer value
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding elements to the TreeMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Display the TreeMap
        System.out.println("TreeMap: " + map); // Output: TreeMap: {Apple=1, Banana=2, Cherry=3}

        // Accessing elements
        System.out.println("Value for key 'Banana': " + map.get("Banana")); // Output: Value for key 'Banana': 2

        // Iterating through the TreeMap
        System.out.println("Iterating through the map:"); // Output: Iterating through the map:
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
       // Output:
//        Key: Apple, Value: 1
//        Key: Banana, Value: 2
//        Key: Cherry, Value: 3

        // Removing an element
        map.remove("Cherry");
        System.out.println("TreeMap after removal: " + map); // Output: TreeMap after removal: {Apple=1, Banana=2
    }
}