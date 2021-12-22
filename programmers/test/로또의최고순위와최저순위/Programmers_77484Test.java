package 로또의최고순위와최저순위;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_77484Test {

    Programmers_77484 s = new Programmers_77484();

    @Test
    public void test(){
        assertArrayEquals(s.solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}), new int[]{3,5});
        assertArrayEquals(s.solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}), new int[]{1,6});
        assertArrayEquals(s.solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}), new int[]{1,1});
    }
}