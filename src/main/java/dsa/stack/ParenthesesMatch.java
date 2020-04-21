package dsa.stack;

public class ParenthesesMatch {
    public static void main(String[] args) {
        char chars[] = {'(', 'a', '+', '(', 'b', '-', 'c', ')', ')'};
        char str1[] = {'(', '(', 'a', '+', 'b', ')'};
        System.out.println(isBalanced(chars));
        System.out.println(isBalanced(str1));
    }

    private static boolean isBalanced(char chars[]) {
        Stack<Character> stack = new BasicStack(50);
        for (char c : chars) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
