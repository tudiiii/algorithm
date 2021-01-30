package TopKFrequentElements;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_347Test {

    Leetcode_347 s = new Leetcode_347();

    @Test
    public void test(){
        //Assert.assertArrayEquals(s.topKFrequent(new int[]{1,1,1,2,2,3},2), new int[]{1,2});
        Assert.assertArrayEquals(s.topKFrequent(new int[]{1,1,1,2,2,3,3,3,3,3},2), new int[]{3,1});
        //Assert.assertArrayEquals(s.topKFrequent(new int[]{1},1), new int[]{1});
    }

}