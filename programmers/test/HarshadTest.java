import static org.junit.Assert.*;
import org.junit.Test;

public class HarshadTest {

    @Test
    public void solution_true() {
        Harshad solution = new Harshad();

        assertTrue("true",solution.solution(10));
        assertFalse("false",solution.solution(13));
        assertTrue("true",solution.solution(12));
        assertFalse("false",solution.solution(7777));
        assertFalse("false",solution.solution(8946));
        assertTrue("true",solution.solution(10000));

    }
}