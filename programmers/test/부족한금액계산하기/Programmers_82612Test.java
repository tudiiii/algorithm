package 부족한금액계산하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_82612Test {
    Programmers_82612 s  = new Programmers_82612();

    @Test
    public void test(){
        assertEquals(s.solution(3,20,4),10);
        assertEquals(s.solution(3,20,5),25);
    }

}