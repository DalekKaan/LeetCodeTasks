package ru.r1b.solution.task1248;

import java.util.HashMap;
import java.util.Map;

/**
 * 1248. Count Number of Nice Subarrays
 */
public class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        int[] prefSum = new int[nums.length];
        prefSum[0] = nums[0] & 1;
        for (int i = 0; i < prefSum.length - 1; i++) {
            prefSum[i + 1] = prefSum[i] + (nums[i + 1] & 1);
        }

        Map<Integer, Integer> storage = new HashMap<>();

        storage.put(0, 1);

        int out = 0;

        for (int i = 0; i < nums.length; i++) {

            if (storage.containsKey(prefSum[i] - k)) {
                out += storage.get(prefSum[i] - k);
            }
            storage.merge(prefSum[i], 1, Integer::sum);

        }
        return out;
    }
}
