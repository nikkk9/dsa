public class P5 {
    // Remove duplicate element from sorted Linked List
    // Input:
    // LinkedList: 2->2->4->5
    // Output: 2 4 5

    Node removeDuplicates(Node head) {
        // Your code here
        if (head == null)
            return null;

        Node curr = head;

        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}
