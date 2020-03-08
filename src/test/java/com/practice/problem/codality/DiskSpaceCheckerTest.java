package com.practice.problem.codality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class DiskSpaceCheckerTest {

    private DiskSpaceChecker diskSpaceChecker;

    @BeforeEach
    void setUp() {
        diskSpaceChecker = new DiskSpaceChecker();
    }

    @MethodSource("writableProvider")
    @ParameterizedTest(name = "{index} => blockSize={0}, fileSize={1}, writable={3}")
    void writable(int blockSize, int fileSize, Set<Integer> occupiedSectors, boolean result) {
        assertThat(diskSpaceChecker.isWritable(blockSize,
                fileSize,
                occupiedSectors), is(result));
    }

    private static Stream<Arguments> writableProvider() {
        return Stream.of(
                Arguments.of(2, 2, newHashSet(1, 2), false),
                Arguments.of(4, 2, newHashSet(1, 2), true),
                Arguments.of(4, 2, newHashSet(1, 3), false),
                Arguments.of(10, 5, newHashSet(1, 2), true)
        );
    }

    public static final <T> Set<T> newHashSet(T... items) {
        Set<T> set = new HashSet<>();
        Collections.addAll(set, items);
        return set;
    }
}