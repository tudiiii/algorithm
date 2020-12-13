package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_94 {

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

    List<Integer> output;

    public List<Integer> inorderTraversal(TreeNode root) {
        output = new ArrayList<>();
        inorderTraverse(root); // 중위순회
        return output;
    }

    private void inorderTraverse(TreeNode node) {
        if(node == null) return;

        inorderTraverse(node.left);
        output.add(node.val);
        inorderTraverse(node.right);
    }
}
