import org.junit.Test;

import static org.junit.Assert.*;

public class programmers_42586Test {

    programmers_42586 s = new programmers_42586();

    @Test
    public void testCase(){
        assertArrayEquals(s.solution(new int[]{93,30,55},new int[]{1,30,5}),new int[]{2,1});
        assertArrayEquals(s.solution(new int[]{95,90,99,99,80,99},new int[]{1,1,1,1,1,1}),new int[]{1,3,2});
    }

}