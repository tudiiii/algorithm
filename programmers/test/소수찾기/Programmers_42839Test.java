package 소수찾기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42839Test {
    Programmers_42839 s = new Programmers_42839();


    @Test
    public void test(){
        assertEquals(s.solution("17"),3);
        assertEquals(s.solution("011"),2);
    }

}