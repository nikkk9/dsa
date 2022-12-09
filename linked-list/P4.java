public class P4 {
    // Reverse a linked list
    // Input:
    // LinkedList: 1->2->3->4->5->6
    // Output: 6 5 4 3 2 1

    // iterative way
    Node reverseList(Node head) {
        // code here
        Node curr = head, prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    // recursive way
    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }
}
