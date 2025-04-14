package ru.r1b.solution.task848;

/**
 * 848. Shifting Letters
 */
public class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long[] prefSum = new long[shifts.length];
        prefSum[shifts.length - 1] = shifts[shifts.length - 1];
        for (int i = shifts.length - 1; i > 0; i--) {
            prefSum[i-1] = prefSum[i] + shifts[i - 1];
        }

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            long prs = prefSum[i];
            chars[i] = (char) ((ch - 'a' + prs) % 26 + 'a');
        }
        return String.valueOf(chars);

    }
}
