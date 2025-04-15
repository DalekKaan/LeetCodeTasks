package ru.r1b.solution.task1248;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
//                Arguments.of(new int[] {1,1,2,1,1}, 3, 2),
                Arguments.of(new int[] {2,2,2,1,2,2,1,2,2,2}, 2, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void numberOfSubarrays(int[] nums, int k, int expected) {
        assertEquals(expected, new Solution().numberOfSubarrays(nums, k));
    }
}