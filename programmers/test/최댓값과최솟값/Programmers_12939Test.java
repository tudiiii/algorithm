package 최댓값과최솟값;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12939Test {

    Programmers_12939 pr = new Programmers_12939();

    @Test
    public void test() {
        assertEquals(pr.solution("1 2 3 4"), "1 4");
        assertEquals(pr.solution("-1 -2 -3 -4"), "-4 -1");
        assertEquals(pr.solution("-1 -1"), "-1 -1");
    }

}