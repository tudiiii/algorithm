import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_15Test {

    Leetcode_15 s = new Leetcode_15();

    @Test
    public void test(){

        int[] input = {-1,0,1,2,-1,-4};
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<List<Integer>> result =  new ArrayList<>();

        result1.add(-1);
        result1.add(-1);
        result1.add(2);
        result2.add(-1);
        result2.add(0);
        result2.add(1);
        result.add(result1);
        result.add(result2);

        Assert.assertEquals(s.threeSum(input),result);
    }

}