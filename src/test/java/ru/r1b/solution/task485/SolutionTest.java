package ru.r1b.solution.task485;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] {1,1,0,1,1,1}, 3),
                Arguments.of(new int[] {1,0,1,1,0,1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void findMaxConsecutiveOnes(int[] nums, int expected) {
        assertEquals(expected, new Solution().findMaxConsecutiveOnes(nums));
    }
}