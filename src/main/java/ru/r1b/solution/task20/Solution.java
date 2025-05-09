package ru.r1b.solution.task20;

import java.util.*;

/**
 * 20. Valid Parentheses
 */
public class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {

            if (ch == '(' | ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (ch == ')' | ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                char needle;
                switch (top) {
                    case '[':
                        needle = ']';
                        break;
                    case '(':
                        needle = ')';
                        break;
                    case '{':
                        needle = '}';
                        break;
                    default:
                        return false;
                }
                if (ch != needle) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}