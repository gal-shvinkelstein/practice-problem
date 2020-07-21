package pragmaticdeveloper.info.problem;

import dsa.stack.BasicStack;

public class ReverseStringUsingStack {
    public String reverse(String input) {
        BasicStack<Character> stack = new BasicStack(input.length());
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
