package ru.r1b.solution.task523;

/**
 * 523. Continuous Subarray Sum
 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % k == 0) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = sum;
            for (int j = nums.length - 1; j > i; j--) {
                temp -= nums[j];
                if (temp % k == 0) {
                    return true;
                }
            }
            sum-=nums[i];
        }
        return false;
    }
}
