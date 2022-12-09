public class P5 {
    // Level order traversal in spiral form

    ArrayList<Integer> findSpiral(Node root) {
        // Your code here
        ArrayList<Integer> tem = new ArrayList<>();

        Queue<Node> q = new LinkedList<>();

        if (root == null) {

            return tem;

        }

        q.offer(root);

        int flag = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            ArrayList<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                if (q.peek().left != null) {

                    q.add(q.peek().left);

                }

                if (q.peek().right != null) {

                    q.add(q.peek().right);

                }

                arr.add(q.poll().data);

            }

            if (flag == 0) {

                Collections.reverse(arr);

                flag = 1;

            }

            else {

                flag = 0;

            }

            for (int i = 0; i < arr.size(); i++) {

                tem.add(arr.get(i));

            }

        }

        return tem;

    }
}
