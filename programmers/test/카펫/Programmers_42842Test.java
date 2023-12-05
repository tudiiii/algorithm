package 카펫;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Programmers_42842Test {
    Programmers_42842 s = new Programmers_42842();

    @Test
    public void test(){
        assertArrayEquals(s.solution(10,2), new int[]{4,3});
        assertArrayEquals(s.solution(8,1), new int[]{3,3});
        assertArrayEquals(s.solution(24,24), new int[]{8,6});
    }

}