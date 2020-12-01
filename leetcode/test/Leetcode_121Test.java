import org.junit.Assert;
import org.junit.Test;

public class Leetcode_121Test {

    Leetcode_121 s = new Leetcode_121();

    @Test
    public void case1(){

        int[] prices = {2,4,1};
        int expected =2;

        Assert.assertEquals(s.maxProfitY(prices),expected);
    }

    @Test
    public void case2(){

        int[] prices = {7,1,5,3,6,2};
        int expected =5;

        Assert.assertEquals(s.maxProfit(prices),expected);
    }

    @Test
    public void case3(){

        int[] prices = {7,6,4,3,1};
        int expected =0;

        Assert.assertEquals(s.maxProfit(prices),expected);
    }
}