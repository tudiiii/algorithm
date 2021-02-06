package TargetSum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_494Test {

    Leetcode_494 s = new Leetcode_494();

    @Test
    public void test(){
        Assert.assertEquals(s.findTargetSumWays(new int[]{1, 1, 1, 1, 1},3),5);
    }

}