package GenerateParentheses;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Leetcode_22Test {
    Leetcode_22 s = new Leetcode_22();

    @Test
    public void test(){
        assertEquals(s.generateParenthesis(3), asList("((()))","(()())","(())()","()(())","()()()"));
        assertEquals(s.generateParenthesis(1), asList("()"));
    }

}