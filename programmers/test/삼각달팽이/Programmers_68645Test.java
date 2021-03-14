package 삼각달팽이;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_68645Test {
    Programmers_68645 s  = new Programmers_68645();

    @Test
    public void test(){
        assertArrayEquals(s.solution(4), new int[]{1,2,9,3,10,8,4,5,6,7});
        assertArrayEquals(s.solution(4), new int[]{1,2,12,3,13,11,4,14,15,10,5,6,7,8,9});
        assertArrayEquals(s.solution(4), new int[]{1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11});
    }

}