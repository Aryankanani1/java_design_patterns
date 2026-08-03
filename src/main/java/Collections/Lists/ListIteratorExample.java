package Collections.Lists;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList of String type
        ArrayList<String> cities = new ArrayList<>();

        // Adding elements to the ArrayList
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Get the ListIterator
        ListIterator<String> iterator = cities.listIterator();

        // Iterate forward through the list
        System.out.println("Forward iteration:"); // Output: Forward iteration:
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output:
//        New York
//        Los Angeles
//        Chicago

        // Iterate backward through the list
        System.out.println("Backward iteration:"); // Output: Backward iteration:
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        // Output:
//        Chicago
//        Los Angeles
//        New York

        // Modify elements during iteration
        System.out.println("Modifying elements:"); // Output: Modifying elements:
        while (iterator.hasNext()) {
            String city = iterator.next();
            if (city.equals("Chicago")) {
                iterator.set("San Francisco");
            }
        }
        System.out.println("Cities after modification: " + cities); // Output: Cities after modification: [New York, Los Angeles, San Francisco]
    }
}
