package 괄호반환;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_60058Test {

    Programmers_60058 s= new Programmers_60058();

    @Test
    public void test(){
        assertEquals(s.solution("(()())()"),"(()())()");
        assertEquals(s.solution(")("),"()");
        assertEquals(s.solution("()))((()"),"()(())()");
    }

}