package ru.r1b.solution.task88;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource("dataSource")
    void merge(int[] nums1, int m, int[] nums2, int n, int[] expected) {
        new Solution().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

    }

    public static Stream<Arguments> dataSource() {
        return Stream.of(
                Arguments.of(
                        new int[] {1,2,3,0,0,0},
                        3,
                        new int[] {2,5,6},
                        3,
                        new int[] {1,2,2,3,5,6}
                ),
                Arguments.of(
                        new int[] {1},
                        1,
                        new int[] {},
                        0,
                        new int[] {1}
                ),
                Arguments.of(
                        new int[] {0},
                        0,
                        new int[] {1},
                        1,
                        new int[] {1}
                ),
                Arguments.of(
                        new int[] {2,0},
                        1,
                        new int[] {1},
                        1,
                        new int[] {1,2}
                ),
                Arguments.of(
                        new int[] {1,0},
                        1,
                        new int[] {2},
                        1,
                        new int[] {1,2}
                )
        );
    }
}