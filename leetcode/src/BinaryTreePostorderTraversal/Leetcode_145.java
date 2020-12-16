package BinaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
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

public class Leetcode_145 {
    List<Integer> output;
    public List<Integer> postorderTraversal(TreeNode root) {

        output = new ArrayList<>();
        postorderTraverse(root); // 후위순회
        return output;

    }

    public void postorderTraverse(TreeNode node){

        if(node==null) return;

        postorderTraverse(node.right);
        postorderTraverse(node.left);
        output.add(node.val);
    }
}
