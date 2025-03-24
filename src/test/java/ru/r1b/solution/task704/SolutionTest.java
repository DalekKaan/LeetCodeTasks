package ru.r1b.solution.task704;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void search() {
        var solution = new Solution();
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        assertEquals(-1, solution.search(new int[]{-1,0,3,5,9,12}, 2));
        assertEquals(0, solution.search(new int[]{5}, 5));
        assertEquals(1, solution.search(new int[]{2,5}, 5));
    }
}