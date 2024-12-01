package com.saiki.leetcode;

import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {
        String s = "(]";
        System.out.println(new Problem20().isValid(s));
    }

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                charStack.push(')');
            } else if (c == '{') {
                charStack.push('}');
            } else if (c == '[') {
                charStack.push(']');
            } else if (charStack.isEmpty() || charStack.pop() != c) {
                return false;
            }
        }
        return charStack.isEmpty();
    }
}
