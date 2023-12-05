package 최솟값만들기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12941Test {

    Programmers_12941 pr = new Programmers_12941();

    @Test
    public void test() {
        assertEquals(pr.solution(new int[]{1,4,2}, new int[]{5,4,4}), 29);
        assertEquals(pr.solution(new int[]{1,2}, new int[]{3,4}), 10);
    }

}