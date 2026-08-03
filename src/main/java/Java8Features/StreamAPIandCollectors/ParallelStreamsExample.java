package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter empty strings using parallel stream
        List<String> filtered = strings.parallelStream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered List (Parallel Stream): " + filtered); // Output: Filtered List (Parallel Stream): [abc, bc, efg, abcd, jkl]
    }
}