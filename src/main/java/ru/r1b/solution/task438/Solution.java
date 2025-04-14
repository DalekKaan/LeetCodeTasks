package ru.r1b.solution.task438;

import java.util.LinkedList;
import java.util.List;

/**
 * 438. Find All Anagrams in a String
 */
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        var out = new LinkedList<Integer>();
        if (p.length()> s.length()) {
            return out;
        }
        char[] chars1 = s.toCharArray(), chars2 = p.toCharArray();
        int[] baseFreq = new int[26], floatFreq = new int[26];

        for (int i = 0; i < chars2.length; i++) {
            baseFreq[chars2[i] - 'a']++;
            floatFreq[chars1[i] - 'a']++;
        }
        int l = 0, r = chars2.length - 1;
        while (r < chars1.length) {
            boolean isAnagram = true;
            for (int i = 0; i < floatFreq.length; i++) {
                if (floatFreq[i] != baseFreq[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if (isAnagram) {
                out.add(l);
            }

            if (r != chars1.length - 1) {
                floatFreq[chars1[l] - 'a']--;
                l++;
                r++;
                floatFreq[chars1[r] - 'a']++;
            } else {
                break;
            }
        }


        return out;
    }
}
