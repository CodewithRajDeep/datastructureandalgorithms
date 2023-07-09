import java.util.*;

public class LinkedListsDS {
    public static void main(String arg[]) {

        LinkedList<String> linkedlist = new LinkedList<String>();

        /*
         * linkedlist.push("A"); //instead of push we use special : offer
         * linkedlist.push("B");
         * linkedlist.push("C");
         * // intentionally not adding linkedlist.push("E") for inserting and deleting
         * // operations
         * linkedlist.push("F");
         * 
         * linkedlist.pop(); // F will be removed from linkedlist
         */

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        // adding node between D and F

        linkedlist.add(4, "E"); // linked list insertion but the only downside is we still need to traverse the
        // element

        linkedlist.remove("E"); // deletion of element from linked list
        // linkedlist.poll(); // remove A from list
        System.out.println(linkedlist.indexOf("F"));

        System.out.println(linkedlist.peekFirst());

        System.out.println(linkedlist.peekLast());

        linkedlist.addFirst("0");
        linkedlist.addLast("G");

        // String first = linkedlist.removeFirst();
        // String last = linkedlist.removeLast();
        System.out.println(linkedlist);
    }
}
