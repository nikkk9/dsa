public class P2 {
    // Nth node from end of linked list
    // Input:
    // N = 2
    // LinkedList: 1->2->3->4->5->6->7->8->9
    // Output: 8
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int getNthFromLast(Node head, int n) {
        // Your code here
        if (head == null)
            return -1;

        int count = 0;
        Node temp = head;

        // getting length of the linkedlist
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        if (count < n)
            return -1;

        count = count - n;
        Node x = head;
        for (int i = 0; i < count; i++) {
            x = x.next;
        }
        return x.data;
    }
}