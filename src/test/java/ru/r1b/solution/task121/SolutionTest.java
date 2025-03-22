package ru.r1b.solution.task121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProfit() {

        assertEquals(
                2,
                new Solution().maxProfit(new int[] {2, 4, 1})
        );
    }
}