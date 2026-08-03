package Collections.HashTables;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable instance
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs to the Hashtable
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);

        // Retrieving a value by key
        Integer value = hashtable.get("Two");
        System.out.println("Value associated with key 'Two': " + value); // Output: Value associated with key 'Two': 2

        // Removing a key-value pair by key
        hashtable.remove("Three");

        // Iterating over the keys using an Enumeration
        System.out.println("\nIterating over keys using Enumeration:"); // Output: Iterating over keys using Enumeration:
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
//        Output:
//        Key: One, Value: 1
//        Key: Four, Value: 4
//        Key: Two, Value: 2


        // Iterating over the entries using an Entry Set and Iterator
        System.out.println("\nIterating over entries using Entry Set and Iterator:"); // Output: Iterating over entries using Entry Set and Iterator:
        Set<Entry<String, Integer>> entrySet = hashtable.entrySet();
        Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
//        Output:
//        Key: One, Value: 1
//        Key: Four, Value: 4
//        Key: Two, Value: 2
    }
}