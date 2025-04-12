package ru.r1b.solution.task56;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        new int[][] {{3,5},{0,0},{4,4},{0,2},{5,6},{4,5},{3,5},{1,3},{4,6},{4,6},{3,4}},
                        new int[][] {{0,6}}
                ),
                Arguments.of(
                        new int[][] {{1,3},{2,6},{8,10},{15,18}},
                        new int[][] {{1,6},{8,10},{15,18}}
                ),
                Arguments.of(
                        new int[][] {{1,4},{4,5}},
                        new int[][] {{1,5}}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("source")
    void merge(int[][] intervals, int[][] expected) {
        assertEquals(
                Arrays.deepToString(expected),
                Arrays.deepToString(new Solution().merge(intervals))
        );
    }


}