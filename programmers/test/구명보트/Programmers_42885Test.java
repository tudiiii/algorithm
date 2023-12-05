package 구명보트;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_42885Test {

    Programmers_42885 pr = new Programmers_42885();

    @Test
    public void test() {
        assertEquals(pr.solution(new int[]{70,50,80,50}, 100),3);
        assertEquals(pr.solution(new int[]{70,80,50}, 100),3);
        assertEquals(pr.solution(new int[]{40,40,40,40,50}, 200),3);
        assertEquals(pr.solution(new int[]{60, 60, 51, 51, 100}, 100),5);
        assertEquals(pr.solution(new int[]{40}, 40),1);
        assertEquals(pr.solution(new int[]{40, 55, 55, 60, 60, 60, 70, 80}, 100),7);
        assertEquals(pr.solution(new int[]{40,50,150,160}, 200),2);
        assertEquals(pr.solution(new int[]{100,500,500,900,950}, 1000),3);
    }

}