package ru.r1b.solution.task125;

/**
 * 125. Valid Palindrome
 */
public class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        int i = 0, j = chars.length - 1;
        while (i < chars.length && j >= 0) {
            char ch1 = chars[i];
            char ch2 = chars[j];
            while (!Character.isLetterOrDigit(ch1) && i < chars.length - 1) {
                i++;
                ch1 = chars[i];
            }
            while (!Character.isLetterOrDigit(ch2) && j > 0) {
                j--;
                ch2 = chars[j];
            }
            if (!Character.isLetterOrDigit(ch1) || !Character.isLetterOrDigit(ch2)) {
                break;
            }

            ch1 = Character.toLowerCase(ch1);
            ch2 = Character.toLowerCase(ch2);
            if (ch1 != ch2) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
