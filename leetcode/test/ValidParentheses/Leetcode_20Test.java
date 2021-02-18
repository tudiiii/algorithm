package ValidParentheses;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Leetcode_20Test {
    Leetcode_20 s = new Leetcode_20();

    @Test
    public void test(){
        assertTrue(s.isValid("()"));
        assertTrue(s.isValid("()[]{}"));
        assertFalse(s.isValid("(]"));
        assertFalse(s.isValid("([)]"));
        assertFalse(s.isValid("{[]}"));
    }

}