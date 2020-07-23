package pragmaticdeveloper.info.problem;

public class IdenticalPairBruteForceApproach {
    public static int identicalPair(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
