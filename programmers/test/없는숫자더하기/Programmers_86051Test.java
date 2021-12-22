package 없는숫자더하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_86051Test {
    Programmers_86051 s = new Programmers_86051();

    @Test
    public void test(){
        assertEquals(s.solution(new int[]{1,2,3,4,6,7,8,0}),14);
        assertEquals(s.solution(new int[]{5,8,4,0,6,7,9}),6);
    }

}