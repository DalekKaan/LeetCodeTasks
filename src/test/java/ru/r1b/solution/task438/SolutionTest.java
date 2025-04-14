package ru.r1b.solution.task438;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        "cbaebabacd", "abc",
                        List.of(0, 6)
                ),
                Arguments.of(
                        "abab", "ab",
                        List.of(0,1,2)
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void findAnagrams(String s, String p, List<Integer> expected) {
        assertEquals(expected, new Solution().findAnagrams(s, p));
    }
}