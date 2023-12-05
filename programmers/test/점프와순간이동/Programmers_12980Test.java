package 점프와순간이동;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12980Test {

    Programmers_12980 pr = new Programmers_12980();

    @Test
    public void test() {
        assertEquals(pr.solution(5),2);
        assertEquals(pr.solution(6),2);
        assertEquals(pr.solution(5000),5);
    }

}