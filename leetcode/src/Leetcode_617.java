
class TreeNode2 {
      int val;
      TreeNode2 left;
      TreeNode2 right;
      TreeNode2() {}
      TreeNode2(int val) { this.val = val; }
      TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
/*
Runtime: 0 ms
Memory Usage: 39.1 MB
 */
public class Leetcode_617 {
    public TreeNode2 mergeTrees(TreeNode2 t1, TreeNode2 t2) {

        TreeNode2 mergeTree = new TreeNode2();

        if(t1==null && t2==null) return null;
        else if(t1==null) return t2;
        else if(t2==null) return t1;
        else mergeTree.val= t1.val+t2.val;

        mergeTree.left = mergeTrees(t1.left, t2.left);
        mergeTree.right = mergeTrees(t1.right, t2.right);

        return mergeTree;
    }
}
