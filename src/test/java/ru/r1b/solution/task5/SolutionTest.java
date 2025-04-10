package ru.r1b.solution.task5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("source")
    void longestPalindrome(String s, String expected) {
        assertEquals(expected, new Solution().longestPalindrome(s));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        "aacabdkacaa",
                        "aca"
                ),
                Arguments.of(
                        "ac",
                        "a"
                ),
                Arguments.of(
                        "babad",
                        "bab"
                ),
                Arguments.of(
                        "cbbd",
                        "bb"
                )
        );
    }
}