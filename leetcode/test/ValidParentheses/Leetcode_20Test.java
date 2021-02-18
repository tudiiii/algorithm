package ValidParentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_20Test {
    Leetcode_20 s = new Leetcode_20();

    @Test
    public void test(){
        Assert.assertEquals(s.isValid("()"),true);
    }

}