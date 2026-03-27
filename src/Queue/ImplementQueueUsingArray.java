package Queue;

public class ImplementQueueUsingArray {
    static class Queue {
        static int arr[];
        static int rear;
        static int size;

        Queue(int n) {
            arr = new int[n];
            rear = -1;
            size = n;
        }

        // Check the Queue is Empty or not
        public  boolean isEmpty() {
            return rear == -1;
        }

        // Add
        public void add(int data) {
            if(rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            int front = arr[0];
            for(int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek element
        public int peek() {
            if(isEmpty()) {
                System.out.println("Stack is Empty");
            }
            return arr[0];
        }

        // display queue
        public void display() {
            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return;
            }else {
                for(int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i] + " ");
                }
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


        q.remove();

        System.out.println(q.peek());
        q.display();
    }
}
