package ru.r1b.solution.task3;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();

        int out = 0, i = 0, j = 0;
        boolean[] counter = new boolean[256];

        while (j < chars.length) {
            char ci = chars[i], cj = chars[j];

            if (!counter[cj]) {
                counter[cj] = true;
                out = Math.max(out, j - i + 1);
                j++;
            } else {
                counter[ci] = false;
                i++;
            }
        }

        return out;


    }
}
