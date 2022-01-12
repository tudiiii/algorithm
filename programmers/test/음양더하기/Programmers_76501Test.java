package 음양더하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_76501Test {
    Programmers_76501 s = new Programmers_76501();

    @Test
    public void test(){
        assertEquals(s.solution(new int []{4,7,12}, new boolean[]{true, false, true}),9);
        assertEquals(s.solution(new int []{1,2,3}, new boolean[]{false, false, true}),0);
    }

}