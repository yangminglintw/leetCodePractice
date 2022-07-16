package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    List<List<Integer>> arrayList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return arrayList;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.val);
        arrayList.add(list);

        levelOrder(root.left);
        levelOrder(root.right);



        return arrayList;
    }
}
