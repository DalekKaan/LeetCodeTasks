package ru.r1b.solution.task523;

/**
 * 523. Continuous Subarray Sum
 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }
        int sum = 0, prev = -1;
        for (int n : nums) {
            if (prev != -1 && (prev + n) % k == 0) {
                return true;
            }
            sum += n;
            prev = n;
        }
        if (sum > 0 && sum< k) {
            return false;
        }
        if (sum % k == 0) {
            return true;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = sum;
            for (int j = nums.length - 1; j > i + 1; j--) {
                temp -= nums[j];
                if (temp % k == 0) {
                    return true;
                }
            }
            sum -= nums[i];
            if (i < nums.length - 2 && sum % k == 0) {
                return true;
            }
        }
        return false;
    }
}
