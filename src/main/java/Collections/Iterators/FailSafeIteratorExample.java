package Collections.Iterators;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorExample {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList which is a fail-safe collection
        List<String> failSafeList = new CopyOnWriteArrayList<>();

        // Adding elements to the CopyOnWriteArrayList
        failSafeList.add("Element1");
        failSafeList.add("Element2");
        failSafeList.add("Element3");

        // Getting the iterator from the CopyOnWriteArrayList
        Iterator<String> iterator = failSafeList.iterator();

        // Iterating over the elements
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Current Element: " + element);

            // Modifying the list during iteration
            failSafeList.add("NewElement");
        }
       // Output:
//        Current Element: Element1
//        Current Element: Element2
//        Current Element: Element3


        System.out.println("\nFinal list after modification:"); // Output: Final list after modification:
        for (String element : failSafeList) {
            System.out.println(element);
        }
       // Output:
//        Element1
//        Element2
//        Element3
//        NewElement
//        NewElement
//        NewElement

    }
}