package DecodeString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_394Test {
    Leetcode_394 s = new Leetcode_394();

    @Test
    public void test(){
        Assert.assertEquals(s.decodeString("3[a]2[bc]"),"aaabcbc");
        Assert.assertEquals(s.decodeString("3[a2[c]]"),"accaccacc");
        Assert.assertEquals(s.decodeString("2[abc]3[cd]ef"),"abcabccdcdcdef");
        Assert.assertEquals(s.decodeString("abc3[cd]xyz"),"abccdcdcdxyz");
        Assert.assertEquals(s.decodeString("100[leetcode]"),"leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode");
    }

}