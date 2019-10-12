import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumTest {

    FibonacciNum s = new FibonacciNum();

    @Test
    public void 피보나치확인(){
        assertEquals(1,s.solution(2));
        assertEquals(2,s.solution(3));
        assertEquals(3,s.solution(4));
        assertEquals(5,s.solution(5));
        assertEquals(8,s.solution(6));
        assertEquals(13,s.solution(7));
        assertEquals(21,s.solution(8));
        assertEquals(34,s.solution(9));
    }

    @Test
    public void 결과(){
        assertEquals(2,s.solution(3));
        assertEquals(5,s.solution(5));
        assertEquals(34,s.solution(9));
    }

}