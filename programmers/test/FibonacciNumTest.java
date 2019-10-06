import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumTest {

    FibonacciNum s = new FibonacciNum();

    @Test
    public void 결과(){
        assertEquals(2,s.solution(3));
        assertEquals(5,s.solution(5));
    }

}