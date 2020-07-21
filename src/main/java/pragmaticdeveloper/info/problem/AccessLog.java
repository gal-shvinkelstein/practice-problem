package pragmaticdeveloper.info.problem;

import java.io.BufferedReader;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccessLog {
    public static IPCount findMostFrequentIP(BufferedReader reader) {
        if (reader == null) {
            return null;
        }
        Map<String, Long> collect = reader.lines()
                .map(line -> line.substring(0, line.indexOf(",")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> sortedMapReverseOrder = collect.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedMapReverseOrder.entrySet().stream()
                .findFirst()
                .map(AccessLog::buildIPCount)
                .orElse(null);
    }

    private static IPCount buildIPCount(Map.Entry<String, Long> entry) {
        IPCount ipCount = new IPCount();
        ipCount.ipAddress = entry.getKey();
        ipCount.count = entry.getValue().intValue();
        return ipCount;
    }

    public static class IPCount {
        public String ipAddress;
        public int count;
    }
}