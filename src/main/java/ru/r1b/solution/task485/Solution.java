package ru.r1b.solution.task485;

/**
 * 485. Max Consecutive Ones
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int out = 0, counter = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                counter++;
            } else {
                out = Math.max(out, counter);
                counter = 0;
            }
            i++;
        }
        return Math.max(out, counter);
    }
}
