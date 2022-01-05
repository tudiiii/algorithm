package 소수만들기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_12977Test {
    Programmers_12977 s  = new Programmers_12977();

    @Test
    public void test(){
        assertEquals(s.solution(new int[]{1,2,3,4}),1);
        assertEquals(s.solution(new int[]{1,2,7,6,4}),4);
    }

}