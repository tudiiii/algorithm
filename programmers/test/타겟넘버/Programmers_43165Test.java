package 타겟넘버;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_43165Test {
    Programmers_43165 s = new Programmers_43165();

    @Test
    public void test(){
        assertEquals(s.solution(new int[]{1, 1, 1, 1, 1},3),5);
    }

}