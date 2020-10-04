import org.junit.Assert;
import org.junit.Test;

public class Leetcode_1Test {

    Leetcode_1 s = new Leetcode_1();

    @Test
    public void test(){

        Assert.assertEquals(s.twoSum(new int[]{2,7,11,15},9),new int[]{0,1});
        Assert.assertEquals(s.twoSum(new int[]{3,2,4},6), new int[]{1,2});
    }

}