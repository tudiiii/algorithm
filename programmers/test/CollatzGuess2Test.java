import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzGuess2Test {

    CollatzGuess2 solution = new CollatzGuess2();

    @Test
    public void collatz확인() {
        // if문
        assertEquals(1,solution.solution(6));
    }

    @Test
    public void 작업이반복되는수확인() {
        assertEquals(8,solution.solution(6));
        assertEquals(4,solution.solution(16));
    }

    @Test
    public void 작업횟수500이상시() {
        assertEquals(-1,solution.solution(626331));
    }

}