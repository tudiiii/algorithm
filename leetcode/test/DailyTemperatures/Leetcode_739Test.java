package DailyTemperatures;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_739Test {

    Leetcode_739 s = new Leetcode_739();

    @Test
    public void test(){
        Assert.assertEquals(s.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}), new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }

}