package 섬연결하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42861Test {
    Programmers_42861 s = new Programmers_42861();

    @Test
    public void test(){
        assertEquals(s.solution(4, new int[][]{{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}}),4);
    }

}