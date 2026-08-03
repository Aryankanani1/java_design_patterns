package Collections.Lists;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Print the elements of the ArrayList
        System.out.println("ArrayList elements: " + arrayList); // Output: ArrayList elements: [Apple, Banana, Cherry]

        // Access an element at a specific index
        String element = arrayList.get(1); // Index 1 corresponds to "Banana"
        System.out.println("Element at index 1: " + element); // Output: Element at index 1: Banana

        // Remove an element from the ArrayList
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + arrayList); // Output: ArrayList after removing Banana: [Apple, Cherry]

        // Iterate over the ArrayList elements
        System.out.print("Iterating over ArrayList: ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        // Output: Iterating over ArrayList: Apple Cherry
    }
}
