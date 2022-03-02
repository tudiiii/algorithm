package 괄호회전하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_76502Test {

    Programmers_76502 s = new Programmers_76502();

    @Test
    public void test(){
        assertEquals(s.solution("[](){}"),3);
        assertEquals(s.solution("}]()[{"),2);
        assertEquals(s.solution("[)(]"),0);
        assertEquals(s.solution("}}}}"),0);
    }
}