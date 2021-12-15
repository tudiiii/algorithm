package 실패율;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42889Test {
    Programmers_42889 s = new Programmers_42889();

    @Test
    public void test(){
        assertArrayEquals(s.solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}),new int[]{3,4,2,1,5});
        assertArrayEquals(s.solution(4, new int[]{4,4,4,4,4}),new int[]{4,1,2,3});
        assertArrayEquals(s.solution(5, new int[]{1,2,2,1,3}),new int[]{3,2,1,4,5});
    }
}