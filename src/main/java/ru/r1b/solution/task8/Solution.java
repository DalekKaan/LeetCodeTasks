package ru.r1b.solution.task8;

/**
 * 8. String to Integer (atoi)
 */
public class Solution {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int out = 0;
        boolean neg = false, starts = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (!starts && Character.isWhitespace(c)) {
                continue;
            }
            if (!starts && c == '-') {
                neg = true;
                starts = true;
                continue;
            }
            if (!starts && c == '+') {
                starts = true;
                continue;
            }
            if (!starts && !Character.isDigit(c)) {
                return 0;
            }
            if (Character.isDigit(c)) {
                starts = true;
                var newOut = out * 10.0 + (c - '0');
                if (neg && (newOut >= -1.0 * Integer.MIN_VALUE)) {
                    return Integer.MIN_VALUE;
                }
                if (!neg && (newOut >= 1.0 * Integer.MAX_VALUE)) {
                    return Integer.MAX_VALUE;
                }
                out = (int) newOut;
                continue;
            }
            if (starts && !Character.isDigit(c)) {
                break;
            }
        }
        if (neg) {
            out *= -1;
        }
        return out;
    }
}
