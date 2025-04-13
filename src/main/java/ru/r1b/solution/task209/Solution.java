package ru.r1b.solution.task209;

/**
 * 209. Minimum Size Subarray Sum
 */
public class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int min = 100000, l = 0, r = 0, carry = 0;
        boolean found = false;
        while (r < nums.length && l < nums.length) {
            carry += nums[r];
            if (carry >= target) {
                found = true;
                min = Math.min(min, r - l + 1);
                carry -= nums[l++] + nums[r];
            } else {
                r++;
            }
        }

        return found ? min : 0;
    }
}
