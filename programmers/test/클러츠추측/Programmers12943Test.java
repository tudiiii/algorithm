package 클러츠추측;

import org.junit.Test;
import 콜라츠추측.Programmers_12943;

import static org.junit.Assert.*;

public class Programmers12943Test {
    Programmers_12943 s = new Programmers_12943();

    @Test
    public void test(){
        assertEquals(s.solution(6),8);
        assertEquals(s.solution(16),4);
        assertEquals(s.solution(626331),-1);
    }

}