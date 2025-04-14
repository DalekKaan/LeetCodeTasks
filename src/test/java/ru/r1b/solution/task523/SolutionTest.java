package ru.r1b.solution.task523;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of( new int[] {23,2,4,6,7}, 6, true),
                Arguments.of( new int[] {23,2,6,4,7}, 6, true),
                Arguments.of( new int[] {23,2,6,4,7}, 13, false),
                Arguments.of( new int[] {23,2,6,3,4,7}, 13, true)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void checkSubarraySum(int[] nums, int k, boolean expected) {
        assertEquals(expected, new Solution().checkSubarraySum(nums, k));
    }
}