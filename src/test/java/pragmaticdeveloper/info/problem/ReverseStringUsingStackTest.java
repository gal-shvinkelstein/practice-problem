package pragmaticdeveloper.info.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseStringUsingStackTest {
    private ReverseStringUsingStack reverseStringUsingStack;

    @BeforeEach
    public void setUp() {
        reverseStringUsingStack = new ReverseStringUsingStack();
    }

    @ParameterizedTest
    @MethodSource("reverseStringProvider")
    public void testReverseString(String input, String output) {
        String result = reverseStringUsingStack.reverse(input);
        assertThat(result, is(output));
    }

    private static Stream<Arguments> reverseStringProvider() {
        return Stream.of(
                Arguments.arguments("hello", "olleh"),
                Arguments.arguments("hi", "ih"),
                Arguments.arguments("devender", "redneved"),
                Arguments.arguments("kumar", "ramuk")

        );
    }
}
