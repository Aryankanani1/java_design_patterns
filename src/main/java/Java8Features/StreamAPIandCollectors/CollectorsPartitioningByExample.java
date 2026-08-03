package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningByExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Partition strings into non-empty and empty
        Map<Boolean, List<String>> partitionedByEmpty = strings.stream()
                .collect(Collectors.partitioningBy(string -> string.isEmpty()));

        System.out.println("Partitioned by Empty: " + partitionedByEmpty);
        // Output: Partitioned by Empty: {false=[abc, bc, efg, abcd, jkl], true=[, ]}
    }
}