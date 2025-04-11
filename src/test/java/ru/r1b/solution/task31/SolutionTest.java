package ru.r1b.solution.task31;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("source")
    void nextPermutation(int[] nums, int[] expected) {
        new Solution().nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] {5,4,7,5,3,2},  new int[] {5,5,2,3,4,7}),
                Arguments.of(new int[] {2,3,1},  new int[] {3,1,2}),
                Arguments.of(new int[] {1,2,3},  new int[] {1,3,2}),
                Arguments.of(new int[] {3,2,1},  new int[] {1,2,3}),
                Arguments.of(new int[] {1,3,2},  new int[] {2,1,3})
        );
    }
}