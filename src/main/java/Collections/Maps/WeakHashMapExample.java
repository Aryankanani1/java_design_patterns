package Collections.Maps;

import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        // Create a WeakHashMap of String key and Integer value
        WeakHashMap<String, Integer> map = new WeakHashMap<>();

        // Adding elements to the WeakHashMap
        String key1 = new String("Apple");
        String key2 = new String("Banana");
        map.put(key1, 1);
        map.put(key2, 2);

        // Display the WeakHashMap
        System.out.println("WeakHashMap: " + map); // Output: WeakHashMap: {Banana=2, Apple=1}

        // Accessing elements
        System.out.println("Value for key 'Apple': " + map.get("Apple")); // Output: Value for key 'Apple': 1

        // Garbage collect the keys
        key1 = null;
        key2 = null;
        System.gc();

        // Allow some time for the garbage collector to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the WeakHashMap after GC
        System.out.println("WeakHashMap after GC: " + map); // Output: WeakHashMap after GC: {}
    }
}