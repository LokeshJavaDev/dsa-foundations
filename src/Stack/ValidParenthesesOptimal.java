package Stack;

import java.util.Stack;

public class ValidParenthesesOptimal {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if ((stack.peek() == '(' && ch == ')')
                            || (stack.peek() == '{' && ch == '}')
                            || (stack.peek() == '[' && ch == ']')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isValid(s));
    }
}