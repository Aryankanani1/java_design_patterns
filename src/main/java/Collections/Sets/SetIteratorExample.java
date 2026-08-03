package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteratorExample {
    public static void main(String[] args) {
        // Create a HashSet of String type
        HashSet<String> animals = new HashSet<>();

        // Adding elements to the HashSet
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Get the Iterator
        Iterator<String> iterator = animals.iterator();

        // Iterate through the set using the iterator
        System.out.println("Iterating through the set:"); // Output: Iterating through the set:
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
       // Output:
//        Cat
//        Elephant
//        Dog


        // Removing elements during iteration
        iterator = animals.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            if (animal.equals("Cat")) {
                iterator.remove();
            }
        }
        System.out.println("Animals after removal: " + animals); // Output: Animals after removal: [Elephant, Dog]
    }
}