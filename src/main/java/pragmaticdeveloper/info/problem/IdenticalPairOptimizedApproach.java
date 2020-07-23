package pragmaticdeveloper.info.problem;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class IdenticalPairOptimizedApproach {
    public int identicalPair(int[] array) {
        Map<Integer, Long> map = Arrays.stream(array)
                .boxed()
                .collect(groupingBy(identity(), counting()));
        return map.entrySet().stream()
                .mapToInt(IdenticalPairOptimizedApproach::countPair).sum();
    }

    private static int countPair(Map.Entry<Integer, Long> entry) {
        /**
         * ((elementCount - 1)) * elementCount / 2;
         * (1-1)*1/2 = 0
         * (2-1)*2/2 = 1
         * (3-1)*3/2 = 3
         * (4-1)*4/2 = 6
         * and so on.....
         */
        return ((entry.getValue().intValue() - 1)) * entry.getValue().intValue() / 2;
    }
}
