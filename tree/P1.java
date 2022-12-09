package tree;

public class P1 {
    // Check for BST

    public static class Node {
        public int data;
        public Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    };

    Node prev;

    boolean isBST(Node root) {
        // inorder
        if (root != null) {
            if (!isBST(root.left))
                return false;

            if (prev != null && root.data <= prev.data)
                return false;

            prev = root;

            return (isBST(root.right));

        }
        return true;

    }

}
