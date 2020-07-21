package pragmaticdeveloper.info.java;

import java.util.HashMap;
import java.util.Map;

public class IdenticalPair {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 5, 4, 4, 5, 4, 4, 6, 3};
        System.out.println((3 - 1) * 3 / 2);
        //System.out.println(solution(arr));
    }

    /*public static int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }
        }
        return count;
    }
*/
    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap();
        // make count of each element
        for (int element : A) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        // count number of pair of pairs
        return map.entrySet().stream()
                .mapToInt(IdenticalPair::countPair).sum();
    }

    private static int countPair(Map.Entry<Integer, Integer> entry) {
        /**
         * ((elementCount - 1)) * elementCount / 2;
         * (1-1)*1/2 = 0
         * (2-1)*2/2 = 1
         * (3-1)*3/2 = 3
         * (4-1)*4/2 = 6
         * and so on.....
         */
        return ((entry.getValue() - 1)) * entry.getValue() / 2;
    }
}
