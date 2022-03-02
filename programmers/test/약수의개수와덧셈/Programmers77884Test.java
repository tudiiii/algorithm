package 약수의개수와덧셈;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers77884Test {
    Programmers_77884_2 s = new Programmers_77884_2();


    @Test
    public void test(){
        assertEquals(s.solution(13,17),43);
        assertEquals(s.solution(24,27),52);
    }

}