import org.junit.Assert;
import org.junit.Test;


public class Leetcode_136Test {

    Leetcode_136 s = new Leetcode_136();

    @Test
    public void test(){
        Assert.assertEquals(s.singleNumber(new int[]{2,2,1}),1);
        Assert.assertEquals(s.singleNumber(new int[]{4,1,2,1,2}),4);
    }

}