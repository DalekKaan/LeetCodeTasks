package ru.r1b.solution.task424;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("ABAB", 2, 4),
                Arguments.of("AABABBA", 1, 4),
                Arguments.of("ABBB", 2, 4),
                Arguments.of("BAAAB", 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void characterReplacement(String s, int k, int expected) {
        assertEquals(expected, new Solution().characterReplacement(s, k));
    }
}