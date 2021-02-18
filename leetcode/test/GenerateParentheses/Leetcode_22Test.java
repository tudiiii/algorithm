package GenerateParentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Leetcode_22Test {
    Leetcode_22 s = new Leetcode_22();

    @Test
    public void test(){
        Assert.assertEquals(s.generateParenthesis(3), new String[]{"((()))", "(()())", "(())()", "()(())", "()()()"});
    }

}