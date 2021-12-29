package 두정수사이의합;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_12912Test {
    Programmers_12912 s = new Programmers_12912();

    @Test
    public void test(){
        assertEquals(s.solution(3,5),12);
        assertEquals(s.solution(3,3),3);
        assertEquals(s.solution(5,3),12);
    }

}