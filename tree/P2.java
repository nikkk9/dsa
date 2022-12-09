package tree;

import java.util.ArrayList;

public class P2 {
    // Left View of Binary Tree

    ArrayList<Integer> leftView(Node root) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();

        leftcheck(root, list, 0);

        return list;
    }

    // preorder
    public void leftcheck(Node root, ArrayList<Integer> list, int level) {

        if (root == null)
            return;

        if (level == list.size())

        {
            list.add(root.data);
        }

        leftcheck(root.left, list, level + 1);

        leftcheck(root.right, list, level + 1);

    }

}
