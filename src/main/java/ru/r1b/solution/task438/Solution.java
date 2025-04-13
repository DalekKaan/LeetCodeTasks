package ru.r1b.solution.task438;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        var out = new LinkedList<Integer>();

        for (int i = 0; i <= s.length() - p.length(); i++) {
            if (isAnagram(s.substring(i, i + p.length()), p)) {
                out.add(i);
            }
        }

        return out;
    }

    private boolean isAnagram(String s, String p) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[p.charAt(i) - 'a']--;
        }

        for (int f : freq) {
            if (f > 0) {
                return false;
            }
        }
        return true;
    }
}
