package N개의최소공배수;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12953Test {

    Programmers_12953 pr = new Programmers_12953();

    @Test
    public void test() {
        assertEquals(pr.solution(new int[]{2,6,8,14}), 168);
        assertEquals(pr.solution(new int[]{1,2,3}), 6);
    }

}