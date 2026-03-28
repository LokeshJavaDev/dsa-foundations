package Queue;

public class ImplementCircularQueueUsingArrays {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        boolean isFull() {
            return (rear + 1) % size == front;
        }

        void add (int data) {
            if(isFull()) {
                System.out.println("Queue is Full....");
            }

            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        int remove() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = arr[front];

            if(front == rear) {
                front = rear = -1;
            }else {
                front = (front + 1) % size;
            }

            return value;

        }

        int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[front];
        }

        void printQueue() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
            }
            int i = front;
            while (true) {
                System.out.println(arr[i] + " ");
                if(i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.printQueue();

        q.remove();
        q.remove();

        q.add(60);
        q.add(70);

        q.printQueue();
    }
}
