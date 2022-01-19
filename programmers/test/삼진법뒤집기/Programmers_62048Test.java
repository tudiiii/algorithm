package 삼진법뒤집기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_62048Test {

    Programmers_62048 s = new Programmers_62048();

    @Test
    public void test(){
        assertEquals(s.solution(45),7);
        assertEquals(s.solution(125),229);
    }

}