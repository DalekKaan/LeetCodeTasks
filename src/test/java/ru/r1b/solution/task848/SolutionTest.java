package ru.r1b.solution.task848;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        "abc", new int[]{3, 5, 9}, "rpl"
                ),
                Arguments.of(
                        "ruu", new int[]{26,9,17}, "rul"
                ),
                Arguments.of(
                        "mkgfzkkuxownxvfvxasy", new int[]{505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513}, "wqqwlcjnkphhsyvrkdod"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void shiftingLetters(String s, int[] shifts, String expected) {
        assertEquals(expected, new Solution().shiftingLetters(s, shifts));
    }
}