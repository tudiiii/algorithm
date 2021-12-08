package 프린터;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42587_2Test {
    Programmers_42587_2 s = new Programmers_42587_2();

    @Test
    public void 기본_테스트_케이스(){
        //assertEquals(s.solution(new int[]{2, 1, 3, 2},2),1);
        //assertEquals(s.solution(new int[]{1, 1, 9, 1, 1, 1},0),5);
        assertEquals(s.solution(new int[]{2,1,2,8,7},2),4);
    }

}