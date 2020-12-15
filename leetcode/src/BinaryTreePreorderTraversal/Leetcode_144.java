package BinaryTreePreorderTraversal;

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

public class Leetcode_144 {

    List<Integer> output ;
    public List<Integer> preorderTraversal(TreeNode root) {

        output = new ArrayList<>();
        preorderTraverse(root); // 전위순회
        return output;

    }

    public void preorderTraverse(TreeNode node){

        if(node==null) return;

        output.add(node.val);
        preorderTraverse(node.left);
        preorderTraverse(node.right);
    }


}
