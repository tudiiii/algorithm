package 올바른괄호;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12909Test {

    Programmers_12909 pr = new Programmers_12909();

    @Test
    public void test() {
        assertTrue(pr.solution("()()"));
        assertTrue(pr.solution("(())()"));
        assertFalse(pr.solution(")()("));
        assertFalse(pr.solution("(()("));

    }
}