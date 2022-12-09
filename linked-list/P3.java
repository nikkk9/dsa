public class P3 {
    // Finding middle element in a linked list
    // Input:
    // LinkedList: 2->4->6->7->5->1
    // Output: 7

    int getMiddle(Node head) {
        // Your code here.
        if (head == null)
            return -1;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
