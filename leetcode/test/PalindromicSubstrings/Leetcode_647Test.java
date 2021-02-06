package PalindromicSubstrings;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_647Test {
    Leetcode_647 s = new Leetcode_647();

    @Test
    public void test(){
        Assert.assertEquals(s.countSubstrings("abc"),3);
        Assert.assertEquals(s.countSubstrings("aaa"),6);
    }

}