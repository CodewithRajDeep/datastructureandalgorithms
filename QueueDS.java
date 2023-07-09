import java.util.Queue;
import java.util.LinkedList;

public class QueueDS {
    public static void main(String arg[]) {
        // Queue is a collection of elements in which insertion and deletion operations
        // are performed at one end.
        // Creating a queue

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // methods inherit from collection class
        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());

        System.out.println(queue.contains("Harold"));

        // System.out.println(queue.peek());
        // queue.poll(); // removes Karen
        // queue.poll(); // removes Chad
        // queue.poll(); // removes Steve

        // System.out.println(queue);

    }
}
