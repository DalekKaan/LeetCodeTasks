package ru.r1b.solution.task3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("source")
    void lengthOfLongestSubstring(String s, int expected) {
        assertEquals(expected, new Solution().lengthOfLongestSubstring(s));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(" ", 1),
                Arguments.of("abcabcbb",3),
                Arguments.of("bbbbb",1),
                Arguments.of("pwwkew",3),
                Arguments.of("data target",6)
        );
    }
}