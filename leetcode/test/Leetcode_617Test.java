import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }*
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Leetcode_617Test {
    Leetcode_617 s = new Leetcode_617();

    @Test
    public void test(){
        Assert.assertEquals(s.mergeTrees(new TreeNode()[1,3,2,5],new TreeNode()[2,1,3,null,4,null,7]),new TreeNode()[3,4,5,5,4,null,7]);
    }

}