package ru.r1b.solution.task424;

public class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() <= k) {
            return k;
        }
        int out = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - k; i++) {
            char baseChar = chars[i];

            int replacements = k, j = i;
            while (j < chars.length && (replacements > 0 || chars[j] == baseChar)) {
                if (chars[j] != baseChar) {
                    replacements--;
                }
                j++;
            }
            if (replacements > 0 ) {
                j = i;
                while (j > 0 && (replacements > 0 || chars[j] == baseChar)) {
                    j--;
                    if (chars[j] != baseChar) {
                        replacements--;
                    }
                }
                out = Math.max(out, chars.length-j);
            } else  {
                out = Math.max(out, j - i);
            }


        }
        return out;
    }

}
