package linkedlist;

/**
 * Created by ajaysinha on 11/02/19.
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static Node construct(int []arr) {
        if(arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public void print() {
        System.out.print("HEAD -> ");
        Node temp = this;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
}
