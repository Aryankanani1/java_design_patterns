package CoreJava.BehavioralPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Aggregate
class NameRepository implements Iterable<String> {
    private List<String> names = new ArrayList<>();

    public void addName(String name) {
        names.add(name);
    }

    @Override
    public Iterator<String> iterator() {
        return names.iterator();
    }
}

// Client
public class IteratorPatternExample {
    public static void main(String[] args) {
        // Create repository and add names
        NameRepository nameRepository = new NameRepository();
        nameRepository.addName("John");
        nameRepository.addName("Jane");
        nameRepository.addName("Jack");

        // Iterate through the names
        for (String name : nameRepository) {
            System.out.println("Name: " + name);
        }
        // Output:
        // Name: John
        // Name: Jane
        // Name: Jack
    }
}
