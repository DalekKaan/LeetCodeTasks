package ru.r1b.solution.task424;

/**
 * 424. Longest Repeating Character Replacement
 */
public class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() <= k) {
            return k;
        }
        int out = 0;
        char[] chars = s.toCharArray();
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        for (char alpha : alphabet) {
            out = Math.max(out, maxWindow(alpha, chars, k));
        }

        return out;
    }

    public int maxWindow(char alpha, char[] chars, int k) {
        int l = 0, r = k, i = l, max = r - l;
        while (r < chars.length) {
            if (chars[i] == alpha) {
                r++;
            } else {
                if (k <= 0) {
                    while (chars[l] == alpha) {
                        l++;
                    }
                    l++;
                    r++;
                } else {
                    k--;
                }
            }
            i++;
            max = Math.max(max, r - l);

        }
        return max;
    }

}
