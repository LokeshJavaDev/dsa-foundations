package Stack;

import java.util.ArrayList;

public class ImplementStackUsingArrayList {

    static ArrayList<Integer> list = new ArrayList<>();
    static int MAX_SIZE = 5;

    public static boolean isEmpty() {
        return list.size() == 0;
    }

    public static boolean isFull() {
        return list.size() == MAX_SIZE;
    }

    // push operation
    public static void push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        list.add(data);
        System.out.println(data + " pushed into stack");
    }

    // pop operation
    public static int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return list.remove(list.size() - 1);
    }

    // peek operation
    public static int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.println("Top element: " + peek());

        while (!isEmpty()) {
            System.out.println("Popped: " + pop());
        }
    }
}