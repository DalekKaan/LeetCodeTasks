package ru.r1b.solution.task848;

/**
 * 848. Shifting Letters
 */
public class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();

        int toShift = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            toShift = (toShift + shifts[i]) % 26;
            char ch = chars[i];
            chars[i] = (char) ((ch - 'a' + toShift) % 26 + 'a');
        }
        return String.valueOf(chars);

    }
}
