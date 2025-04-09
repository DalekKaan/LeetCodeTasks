package ru.r1b.solution.task88;

/**
 * 88. Merge Sorted Array
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int i = m - 1, j = n - 1, offset = nums1.length - 1;
        while (offset >= 0) {
            if (j < 0 || (i >= 0 && nums1[i] > nums2[j])) {
                nums1[offset--] = nums1[i--];
            } else if (i < 0 || (j >= 0 && nums1[i] < nums2[j])) {
                nums1[offset--] = nums2[j--];
            } else {
                nums1[offset--] = nums1[i--];
                nums1[offset--] = nums2[j--];
            }
        }

    }
}
