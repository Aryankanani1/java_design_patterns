package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsCountingExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Count the number of non-empty strings
        long count = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.counting());

        System.out.println("Count of non-empty strings: " + count); // Output: Count of non-empty strings: 5
    }
}