package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Enqueue
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        System.out.println("Removed: " + q.remove());

        System.out.println("Front: " + q.peek());

        System.out.println("Size: " + q.size());

        System.out.println("Queue: " + q);
    }
}
