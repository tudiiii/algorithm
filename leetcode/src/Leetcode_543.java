
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
public class Leetcode_543 {

    int depth;

    public int diameterOfBinaryTree(TreeNode root) {

        depth =0;
        checkNode(root);
        return depth;
    }

    public int checkNode(TreeNode treeNode){

        if(treeNode==null) return 0;

        int leftNode = checkNode(treeNode.left);
        int rightNode = checkNode(treeNode.right);

        depth = Math.max(depth, leftNode+rightNode);

        return Math.max(leftNode,rightNode)+1;
    }
}
