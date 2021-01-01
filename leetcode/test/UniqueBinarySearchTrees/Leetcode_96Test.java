package UniqueBinarySearchTrees;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_96Test {

    Leetcode_96 s = new Leetcode_96();

    @Test
    public void test(){
        Assert.assertEquals(s.numTrees(3),5);
    }

}