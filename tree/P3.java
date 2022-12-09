public class P3 {
    // Check for Balanced Tree

    boolean isBalanced(Node root) {
        return treeHeight(root) != -1;
    }

    int treeHeight(Node root) {
        if (root == null)
            return 0;

        int leftHeight = treeHeight(root.left);
        if (leftHeight == -1)
            return -1;

        int rightHeight = treeHeight(root.right);
        if (rightHeight == -1)
            return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}