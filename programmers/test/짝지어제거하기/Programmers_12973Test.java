package 짝지어제거하기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_12973Test {
    Programmers_12973 s = new Programmers_12973();

    @Test
    public void test(){
        assertEquals(s.solution("baabaa"),1);
        assertEquals(s.solution("cdcd"),0);
    }

}