package 모음상점;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_84512Test {
    Programmers_84512 s = new Programmers_84512();

    @Test
    public void 기본_테스트_케이스(){
        assertEquals(s.solution("AAAAE"),6);
        assertEquals(s.solution("AAAE"),10);
        assertEquals(s.solution("I"),1563);
        assertEquals(s.solution("EIO"),1189);
    }

}