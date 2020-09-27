import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_448Test {

    Leetcode_448 s = new Leetcode_448();

    @Test
    public void test(){
        Assert.assertEquals(s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}),new int[]{5,6});
    }

}