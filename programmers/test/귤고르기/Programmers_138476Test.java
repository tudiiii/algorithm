package 귤고르기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_138476Test {

    Programmers_138476 pr = new Programmers_138476();

    @Test
    public void test() {
        assertEquals(pr.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}), 3);
        assertEquals(pr.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}), 2);
        assertEquals(pr.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}), 1);
    }

}