package ru.r1b.solution.task1248;

import java.util.HashMap;
import java.util.Map;

/**
 * 1248. Count Number of Nice Subarrays
 */
public class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        int prefSum = 0;
        Map<Integer, Integer> storage = new HashMap<>();

        storage.put(0, 0);

        int out = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            prefSum += num % 2;

            if (storage.containsKey(prefSum - k)) {
                out += storage.get(prefSum - k);
            }
            storage.merge(prefSum, 1, Integer::sum);

        }
        return out;
    }
}
