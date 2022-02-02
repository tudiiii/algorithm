package 키패드누르기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_67256Test {
    Programmers_67256 s = new Programmers_67256();

    @Test
    public void test(){
        assertEquals(s.solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"),"LRLLLRLLRRL");
        assertEquals(s.solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},"left"),"LRLLRRLLLRR");
        assertEquals(s.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},"right"),"LLRLLRLLRL");
    }

}