package ru.r1b.solution.task523;

import java.util.HashMap;
import java.util.Map;

/**
 * 523. Continuous Subarray Sum
 */
public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // stolen https://github.com/AnatoliySokolov98/LeetCode/blob/main/0523/solution.java
        Map<Integer, Integer> mods = new HashMap<>();
        mods.put(0, -1);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = (total + nums[i]) % k;
            if (mods.containsKey(total)) {
                if (i - mods.get(total) > 1)
                    return true;
            } else {
                mods.put(total, i);
            }
        }
        return false;
    }
}
