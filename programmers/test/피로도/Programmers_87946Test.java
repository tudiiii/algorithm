package 피로도;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_87946Test {

    Programmers_87946 pr = new Programmers_87946();

    @Test
    public void test() {
        assertEquals(pr.solution(80, new int[][]{{80,20},{50,40},{30,10}}),3);
    }

}