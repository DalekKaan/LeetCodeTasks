package ru.r1b.solution.task5;

/**
 * 5. Longest Palindromic Substring
 */
public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int l = 0, r, maxl = 0;
        String out = s.substring(0, 1);


        while (l < chars.length) {
            r = chars.length - 1;
            while (r > l) {
                if (r - l > maxl && isPoly(chars, l, r)) {
                    out = s.substring(l, r + 1);
                    maxl = r - l;
                    break;
                }
                r--;
            }
            l++;
        }

        return out;
    }

    private boolean isPoly(char[] chars, int l, int r) {
        while (l < r) {
            if (chars[l] != chars[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
