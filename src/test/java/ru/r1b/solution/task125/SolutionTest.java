package ru.r1b.solution.task125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindrome() {
        assertTrue(new Solution().isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(new Solution().isPalindrome("race a car"));
        assertTrue(new Solution().isPalindrome(" "));
        assertTrue(new Solution().isPalindrome("a."));
        assertTrue(new Solution().isPalindrome(".,"));
        assertFalse(new Solution().isPalindrome("0P"));
    }
}