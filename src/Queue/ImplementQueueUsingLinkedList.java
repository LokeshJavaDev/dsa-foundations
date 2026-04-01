package Queue;

public class ImplementQueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue Properties
    Node front = null;
    Node rear = null;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if(rear == null) {
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println(data + " inserted");
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;
        front = front.next;

        if(front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }else {
            return front.data;
        }
    }

    public void printQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ImplementQueueUsingLinkedList q = new ImplementQueueUsingLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.printQueue();
        q.dequeue();
        q.printQueue();
    }
}
