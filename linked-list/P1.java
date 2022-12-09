public class P1 {
    // Detect Loop in linked list
    // Input:
    // N = 3
    // value[] = {1,3,4}
    // x(position at which tail is connected) = 2
    // Output: True

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        // Add code here

        if (head == null)
            return false;

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
