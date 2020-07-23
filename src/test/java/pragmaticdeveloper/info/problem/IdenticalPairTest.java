package pragmaticdeveloper.info.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.params.provider.Arguments.of;

class IdenticalPairTest {
    private IdenticalPairOptimizedApproach optimizedApproach;
    private IdenticalPairBruteForceApproach bruteForceApproach;

    @BeforeEach
    public void setUp() {
        optimizedApproach = new IdenticalPairOptimizedApproach();
        bruteForceApproach = new IdenticalPairBruteForceApproach();
    }

    @ParameterizedTest
    @MethodSource("arrayInputProvider")
    void testIdenticalPairOptimizedApproach(int array[], int identicalPair) {
        int pairCount = optimizedApproach.identicalPair(array);
        assertThat(pairCount, is(identicalPair));
    }

    @ParameterizedTest
    @MethodSource("arrayInputProvider")
    void testIdenticalPairBruteForceApproach(int array[], int identicalPair) {
        int pairCount = bruteForceApproach.identicalPair(array);
        assertThat(pairCount, is(identicalPair));
    }

    public static Stream<Arguments> arrayInputProvider() {
        return Stream.of(
                of(new int[]{3, 5, 6, 3, 3, 5}, 4),
                of(new int[]{3, 5, 6, 3, 7, 5}, 2),
                of(new int[]{3, 5, 6, 3, 3, 3, 5}, 7),
                of(new int[]{3, 5, 6, 7, 8, 9}, 0)
        );
    }
}