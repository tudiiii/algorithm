package MaximumSubarray;

import org.junit.Assert;
import org.junit.Test;


public class Leetcode_53Test {
    Leetcode_53 s = new Leetcode_53();

    @Test
    public void test(){
        Assert.assertEquals(s.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}),6);
        Assert.assertEquals(s.maxSubArray(new int[]{1}),1);
        Assert.assertEquals(s.maxSubArray(new int[]{5,4,-1,7,8}),23);
    }
}