package queue;

public class P1 {
    // Stack using two queues

    class Queues {
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

        // Function to push an element into stack using two queues.
        void push(int a) {
            // Your code here
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(a);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }

        }

        // Function to remove an element from stack using two queues.
        int pop() {
            // Your code here
            if (q1.isEmpty())
                return -1;
            return q1.remove();
        }

    }

}
