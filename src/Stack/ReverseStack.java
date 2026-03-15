package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack,data);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverseStack(stack);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
