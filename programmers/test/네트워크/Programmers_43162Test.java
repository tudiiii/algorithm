package 네트워크;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_43162Test {

    Programmers_43162 s = new Programmers_43162();

    @Test
    public void test(){
        assertEquals(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}),2);
        assertEquals(s.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}),1);
    }

}