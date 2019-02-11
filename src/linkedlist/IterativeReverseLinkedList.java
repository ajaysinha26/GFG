package linkedlist;

/**
 *  Iterative program to reverse a linked list
 *
 *
 * Created by ajaysinha on 11/02/19.
 */
public class IterativeReverseLinkedList {

    public Node reverse(Node head) {
        if(head == null) {
            return null;
        }

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = Node.construct(new int[]{1, 2, 3, 4});

        head.print();

        head = new IterativeReverseLinkedList().reverse(head);
        head.print();
    }

}
