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
        int out = 1;
        char[] chars = s.toCharArray();
        int i = 0, j = 1;
        boolean[] counter = new boolean[256];

        do {
            char ci = chars[i];
            char cj = chars[j];
            counter[ci] = true;

            if (counter[cj]) {
                out = Math.max(out, j - i);
                for (int k = i; k < j; k++) {
                    counter[chars[k]] = false;
                }
                i++;
                j = i + 1;
                continue;
            }
            counter[cj] = true;
            j++;

        } while (j < chars.length);

        /*
        data target

        pwwkew

        abcabcbb
         */

        return Math.max(out, j - i);


    }
}
