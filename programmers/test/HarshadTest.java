import static org.junit.Assert.*;
import org.junit.Test;

public class HarshadTest {

    @Test
    public void solution_true() {
        Harshad solution = new Harshad();


        long startTime = System.nanoTime();
        assertTrue("true",solution.solution(10));
        assertFalse("false",solution.solution(13));
        assertTrue("true",solution.solution(12));


        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("걸린 시간 : " + estimatedTime/1000000000.0 + " milli seconds");
    }
}