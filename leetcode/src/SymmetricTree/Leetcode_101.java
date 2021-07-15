package SymmetricTree;

//Definition for a binary tree node.
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

public class Leetcode_101 {
    public boolean isSymmetric(TreeNode root) {
        return root!=null && isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode right, TreeNode left){
        if(right==null && left==null) return true;
        if(right==null || left==null) return false;
        if(right.val!=left.val) return false;

        return isSymmetricTree(right.left, left.right) && isSymmetricTree(right.right,left.left);
    }
}

