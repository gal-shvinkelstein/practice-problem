package pragmaticdeveloper.info.problem;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class CountDuplicateElement {
    public static int countNonUnique(List<Integer> numbers) {
        return (int) numbers.stream()
                .collect(groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .count();
    }
}
