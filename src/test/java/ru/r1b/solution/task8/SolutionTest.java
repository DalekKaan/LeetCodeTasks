package ru.r1b.solution.task8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("source")
    void myAtoi(String s, int expected) {
        assertEquals(expected, new Solution().myAtoi(s));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        "-2147483648",
                        -2147483648
                ),
                Arguments.of(
                        "-2147483649",
                        -2147483648
                ),
                Arguments.of(
                        "+1",
                        1
                ),
                Arguments.of(
                        "-91283472332",
                        -2147483648
                ),
                Arguments.of(
                        "    -88827   5655  U",
                        -88827
                ),
                Arguments.of(
                        "20000000000000000000",
                        2147483647
                ),
                Arguments.of(
                        "-2147483647",
                        -2147483647
                ),
                Arguments.of(
                        "4193 with words",
                        4193
                ),
                Arguments.of(
                        "   +0 123",
                        0
                ),
                Arguments.of(
                        "21474836460",
                        2147483647
                ),
                Arguments.of(
                        "42",
                        42
                ),
                Arguments.of(
                        "-042",
                        -42
                ),
                Arguments.of(
                        "0-1",
                        0
                ),
                Arguments.of(
                        "words and 987",
                        0
                ),
                Arguments.of(
                        "+-855",
                        0
                ),
                Arguments.of(
                        "-855",
                        -855
                ),
                Arguments.of(
                        " -85sdddd5",
                        -85
                )
        );
    }
}