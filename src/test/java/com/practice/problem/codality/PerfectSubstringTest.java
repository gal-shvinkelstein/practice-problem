package com.practice.problem.codality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class PerfectSubstringTest {
    private PerfectSubstring perfectSubstring;

    @BeforeEach
    public void setUp() {
        perfectSubstring = new PerfectSubstring();

    }

    @MethodSource("perfectSubstringProvider")
    @ParameterizedTest
    void perfectSubstring(String input, int subStringLength, int expected) {
        int count = perfectSubstring.perfectSubstring(input, subStringLength);
        assertThat(count, is(expected));

    }

    private static Stream<Arguments> perfectSubstringProvider() {
        return Stream.of(
                Arguments.of("1102021222", 2, 6),
                Arguments.of("1020122", 2, 2),
                Arguments.of("1221221121", 3, 3)
        );
    }
}