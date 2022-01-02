package 최소직사각형;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_86491Test {

    Programmers_86491 s = new Programmers_86491();

    @Test
    public void test(){
        assertEquals(s.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}),4000);
        assertEquals(s.solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}),120);
        assertEquals(s.solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}),133);
    }

}