package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter empty strings
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered); // Output: Filtered List: [abc, bc, efg, abcd, jkl]

        // Map function example
        List<Integer> lengths = strings.stream()
                .filter(string -> !string.isEmpty())
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Lengths of non-empty strings: " + lengths); // Output: Lengths of non-empty strings: [3, 2, 3, 4, 3]
    }
}