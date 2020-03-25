package com.practice.problem.codality;

import dsa.stack.Stack;

public class ReverseStringUsingStack {
    public String reverse(String input) {
        Stack<Character> stack = new Stack(input.length());
        for (char item : input.toCharArray()) {
            stack.push(item);
        }
        StringBuilder sb = new StringBuilder();
        while (stack.hasMoreItem()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
