package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {

        TreeNode left = root;

        ArrayList<Integer> arrayList = new ArrayList<>();

        if (root == null) {
            return arrayList;
        }

        while (root != null) {
            arrayList.add(root.val);
            root = root.right;
        }

        int depth = 0;

        while (left != null) {
            if (depth == arrayList.size()) {
                arrayList.add(left.val);
            }
            left = left.left;
            depth += 1;
        }

        return arrayList;
    }


}
