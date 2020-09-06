import org.junit.Test;

import static org.junit.Assert.*;

public class programmers_42568Test {

    programmers_42568 s = new programmers_42568();

    @Test
    public void 입출력예1(){
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        int[] expected = {2,1};

        assertArrayEquals(s.solution(progresses,speeds),expected);
    }

    @Test
    public void 입출력예2(){
        int[] progresses = {95,90,99,99,80,99};
        int[] speeds = {1,1,1,1,1,1};
        int[] expected = {1,3,2};

        assertArrayEquals(s.solution(progresses,speeds),expected);
    }

}