package RomantoInteger;

import org.junit.Assert;
import org.junit.Test;

public class Leetcode_13Test {

    Leetcode_13 s = new Leetcode_13();

    @Test
    public void test(){
        Assert.assertEquals(s.romanToInt("III"),3);
        Assert.assertEquals(s.romanToInt("IV"),4);
        Assert.assertEquals(s.romanToInt("IX"),9);
        Assert.assertEquals(s.romanToInt("LVIII"),58);
        Assert.assertEquals(s.romanToInt("MCMXCIV"),1994);

    }

}