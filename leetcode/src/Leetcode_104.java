
/*
104. Maximum Depth of Binary Tree
runtime 0 ms	memory 39.1 MB
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Leetcode_104 {

    public int maxDepth(TreeNode root) {
        return getMaxDepth(root, 0);
    }

    public int getMaxDepth(TreeNode root, int depth) { // right vs left
        if (root == null) return depth;

        return Math.max(getMaxDepth(root.left, depth + 1), getMaxDepth(root.right, depth + 1));
    }

}
