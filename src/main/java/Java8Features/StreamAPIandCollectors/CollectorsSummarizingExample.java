package Java8Features.StreamAPIandCollectors;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsSummarizingExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 8, 1, 9, 12, 4);

        // Get summary statistics of the numbers
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Summary Statistics: " + stats);
        // Output: Summary Statistics: IntSummaryStatistics{count=7, sum=42, min=1, average=6.000000, max=12}
    }
}