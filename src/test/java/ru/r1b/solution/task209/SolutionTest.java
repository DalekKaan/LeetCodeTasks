package ru.r1b.solution.task209;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] {1,1,1,1,256,1,28, 1,1,1,1}, 258, 3 ),
                Arguments.of(new int[] {115}, 116, 0 ),
                Arguments.of(new int[] {115,2,116}, 116, 1 ),
                Arguments.of(new int[] {2,3,1,2,4,3}, 7, 2 ),
                Arguments.of(new int[] {1,4,4}, 4, 1 ),
                Arguments.of(new int[] {1,1,1,1,1,1,1,1}, 11, 0 )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void minSubArrayLen(int[] nums, int target, int expected) {
        assertEquals(expected, new Solution().minSubArrayLen(target,nums));
    }
}