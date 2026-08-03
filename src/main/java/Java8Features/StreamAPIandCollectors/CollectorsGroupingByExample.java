package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsGroupingByExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "ab", "bc", "efg", "abcd", "jkl");

        // Group strings by their length
        Map<Integer, List<String>> groupedByLength = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by Length: " + groupedByLength);
        // Output: Grouped by Length: {2=[ab, bc], 3=[abc, efg, jkl], 4=[abcd]}
    }
}