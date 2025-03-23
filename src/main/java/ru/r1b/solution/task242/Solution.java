package ru.r1b.solution.task242;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 242. Valid Anagram
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        LinkedList<Character> w1list = s
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedList::new));

        LinkedList<Character> w2list = t
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedList::new));

        Iterator<Character> w1iterator = w1list.iterator();
        Iterator<Character> w2iterator = w2list.iterator();

        while (w1iterator.hasNext()) {
            Character w1char = w1iterator.next();
            while (w2iterator.hasNext()) {
                Character w2char = w2iterator.next();
                if (w1char.equals(w2char)) {
                    w1iterator.remove();
                    w2iterator.remove();
                    w2iterator = w2list.iterator();
                    break;
                }
            }
        }


        return w1list.isEmpty() && w2list.isEmpty();
    }
}
