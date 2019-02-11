package linkedlist;

/**
 * Program to detect loop in a LinkedList
 *
 * 1 -> 2 -> 3 -> 4 -> 5
 *           ^         |
 *           |         >
 *           8 <- 7 <- 6
 *
 *
 * Created by ajaysinha on 11/02/19.
 */
public class LinkedListLoopDetector {

    public Node findLoopNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (true) {
            fast = fast.next;
            if(fast.next != null) {
                fast = fast.next;
            } else {
                return null; // No Loop
            }
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListLoopDetector loopDetector = new LinkedListLoopDetector();

        Node nonLoopNode = Node.construct(new int[] {1, 2, 3, 4});
        System.out.println(loopDetector.findLoopNode(nonLoopNode));

        Node loopNode = Node.construct(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
        Node temp = loopNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = loopNode.next.next;

        System.out.println(loopDetector.findLoopNode(loopNode).data);
    }

}
