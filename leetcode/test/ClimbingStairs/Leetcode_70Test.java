package ClimbingStairs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_70Test {
    Leetcode_70 s = new Leetcode_70();

    @Test
    public void test(){
        Assert.assertEquals(s.climbStairs(2),2);
        Assert.assertEquals(s.climbStairs(3),3);
        Assert.assertEquals(s.climbStairs(4),5);
        Assert.assertEquals(s.climbStairs(5),8);
    }
}