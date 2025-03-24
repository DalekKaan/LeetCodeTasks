package ru.r1b.solution.task704;

/**
 * 704. Binary Search
 */
public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        // todo: the borders should be thought about
        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid]) {
                left = mid;
            }
        }
        if (nums[right] == target) {
            return right;
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
