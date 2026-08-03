package Collections.Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Obtain a ListIterator
        ListIterator<Integer> iterator = list.listIterator();

        // Traverse the list in forward direction
        System.out.println("Traversing the list in forward direction:"); // Output: Traversing the list in forward direction:
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
       // Output:
//        Element: 1
//        Element: 2
//        Element: 3
//        Element: 4
//        Element: 5

        // Traverse the list in backward direction
        System.out.println("Traversing the list in backward direction:"); // Output: Traversing the list in backward direction:
        while (iterator.hasPrevious()) {
            System.out.println("Element: " + iterator.previous());
        }
       // Output:
//        Element: 5
//        Element: 4
//        Element: 3
//        Element: 2
//        Element: 1
    }
}