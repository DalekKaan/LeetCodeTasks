package ru.r1b.solution.task31;

/**
 * 31. Next Permutation
 */
public class Solution {
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 2; i >= 0; i--) {
            int minr = findMinRight(i, nums);
            if (minr != -1) {
                swap(minr, i, nums);
                sort(i+1, nums.length-1, nums);
                return;
            }
        }
        invert(nums);

    }

    private void sort(int l, int r, int[] nums) {
        for (int i = l; i < r; i++) {
            for (int j = l; j < r; j++) {
                if (nums[j] > nums[j+1]) {
                    swap(j, j+1, nums);
                }
            }
        }
    }
    private int findMinRight(int i, int[] nums) {
        int k = i, min =101, out = -1;
        while (k<nums.length) {
            if (nums[k] > nums[i] && nums[k]< min) {
                min = nums[k];
                out = k;
            }
            k++;
        }
        return out;
    }

    private void invert(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            swap(l, r, nums);
            l++;
            r--;
        }
    }

    private void swap(int i, int j, int[] nums) {
        nums[i] = nums[i] + nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
