package RotateImage;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_48Test {

    Leetcode_48 s = new Leetcode_48();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}}), new int[][]{{7,4,1},{8,5,2},{9,6,3}});
    }

}