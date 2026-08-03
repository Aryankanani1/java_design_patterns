package Collections.Sets;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of String type
        HashSet<String> countries = new HashSet<>();

        // Adding elements to the HashSet
        countries.add("USA");
        countries.add("Canada");
        countries.add("Mexico");

        // Display the HashSet
        System.out.println("Countries: " + countries); // Output: Countries: [Canada, USA, Mexico]

        // Checking if an element exists
        if (countries.contains("Canada")) {
            System.out.println("Canada is in the set."); // Output: Canada is in the set.
        }

        // Iterating through the HashSet
        System.out.println("Iterating through the set:"); // Output: Iterating through the set:
        for (String country : countries) {
            System.out.println(country);
        }
        // Output:
//        Canada
//        USA
//        Mexico


        // Removing an element
        countries.remove("Mexico");
        System.out.println("Countries after removal: " + countries); // Output: Countries after removal: [Canada, USA]
    }
}