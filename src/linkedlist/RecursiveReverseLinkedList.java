package linkedlist;

/**
 * Recursive program to reverse a linked list
 *
 * Created by ajaysinha on 11/02/19.
 */
public class RecursiveReverseLinkedList {

    private Node head;

    public RecursiveReverseLinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void reverse() {
        reverseInternal(head);
    }

    private Node reverseInternal(Node node) {
        if(node == null) {
            return null;
        }

        Node reversedNode = reverseInternal(node.next);
        if(reversedNode == null) {
            this.head = node;
        } else {
            reversedNode.next = node;
            node.next = null;
        }

        return node;
    }

    public static void main(String[] args) {
        Node head = Node.construct(new int[]{1, 2, 3, 4});
        head.print();

        RecursiveReverseLinkedList recursiveReverseLinkedList = new RecursiveReverseLinkedList(head);
        recursiveReverseLinkedList.reverse();
        recursiveReverseLinkedList.getHead().print();

    }

}
