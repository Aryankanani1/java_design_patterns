package Collections.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Obtain an Iterator
        Iterator<Integer> iterator = list.iterator();

        // Traverse the list
        System.out.println("Traversing the list:");
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
            // Modify the list while iterating (this will cause ConcurrentModificationException)
            if (iterator.next() == 3) {
                list.add(6);
            }
        }

       // Output:
//        Traversing the list:
//        Element: 1
//        Element: 3
//        Element: 5
//        Exception in thread "main" java.util.NoSuchElementException
//        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
//        at Collections.Iterators.FailFastIteratorExample.main(FailFastIteratorExample.java:25)
    }
}