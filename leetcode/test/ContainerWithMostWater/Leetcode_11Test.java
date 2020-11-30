package ContainerWithMostWater;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_11Test {

    Leetcode_11 s = new Leetcode_11();

    @Test
    public void test(){
        Assert.assertEquals(s.maxArea(new int[]{1,1}),1);
        Assert.assertEquals(s.maxArea(new int[]{4,3,2,1,4}),16);
        Assert.assertEquals(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}),49);
    }

}