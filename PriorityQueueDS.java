import java.util.*;

public class PriorityQueueDS {

    public static void main(String arg[]) {
        // Queue<Double> queue = new LinkedList<>();
        // LinkList method creates standard queue

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        // Queue<String> queue = new PriorityQueue<>();

        // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); //
        // gives order in reverse order
        // Queue<Double> queue = new PriortiyQueue<>();
        // Priority queue returns queue in order based on its priority

        queue.offer("D");
        queue.offer("B");
        queue.offer("A");
        queue.offer("C");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
