package Java8Features.StreamAPIandCollectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Collect non-empty strings to a list
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered); // Output: Filtered List: [abc, bc, efg, abcd, jkl]

        // Join non-empty strings with a comma
        String mergedString = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));

        System.out.println("Merged String: " + mergedString); // Output: Merged String: abc, bc, efg, abcd, jkl
    }
}