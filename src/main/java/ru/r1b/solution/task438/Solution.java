package ru.r1b.solution.task438;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        var out = new LinkedList<Integer>();
        char[] chars1 = s.toCharArray(), chars2 = p.toCharArray();
        int[] freq = new int[26];

        int l = 0, r = chars2.length-1;
        while (r < chars1.length) {
            for (int i = l; i <= r; i++) {
                freq[chars1[i] - 'a']++;
                freq[chars2[i-l] - 'a']--;
            }
            boolean isAnagram = true;
            for (int i = 0; i < freq.length; i++) {
                int f = freq[i];
                if (f > 0) {
                    isAnagram = false;
                }
                freq[i] = 0;
            }
            if (isAnagram) {
                out.add(l);
            }
            l++;
            r++;
        }


        return out;
    }
}
