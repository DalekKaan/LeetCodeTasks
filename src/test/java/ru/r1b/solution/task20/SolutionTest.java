package ru.r1b.solution.task20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertTrue(solution.isValid("([])"));
    }
}