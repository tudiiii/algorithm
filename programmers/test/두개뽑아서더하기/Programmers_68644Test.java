package 두개뽑아서더하기;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Programmers_68644Test {
    Programmers_68644 s = new Programmers_68644();

    @Test
    public void test(){
        assertArrayEquals(s.solution(new int[]{2,1,3,4,1}), new int[]{2,3,4,5,6,7});
        assertArrayEquals(s.solution(new int[]{5,0,2,7}), new int[]{2,5,7,9,12});
    }

}