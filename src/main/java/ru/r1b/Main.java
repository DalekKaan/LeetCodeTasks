package ru.r1b;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.isValid("(][)"));
    }
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {

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
                    case '[': needle = ']'; break;
                    case '(': needle = ')'; break;
                    case '{': needle = '}'; break;
                    default: return false;
                };
                if (ch != needle) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }

    private boolean checkStack(String s, HashMap<Character, Character> pairs) {

        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {

            if (ch == '(' | ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }

            if (ch == ')' | ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch != pairs.get(top)) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}