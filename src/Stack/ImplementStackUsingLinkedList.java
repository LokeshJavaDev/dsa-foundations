package Stack;

public class ImplementStackUsingLinkedList {
    static  class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static Node top = null;

    public static boolean isEmpty() {
        return top == null;
    }

    // push
    public static void push(int data) {
        Node newNode = new Node(data);

        if(isEmpty()) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
    }


    // pop
    public static int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
        }

        int topData = top.data;
        top = top.next;
        return topData;
    }

    // peek
    public static int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);

        while (!isEmpty()) {
            System.out.println(peek());
            pop();
        }
    }
}
