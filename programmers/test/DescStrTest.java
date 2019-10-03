import org.junit.Test;

import static org.junit.Assert.*;

public class DescStrTest {

    DescStr solution = new DescStr();

    @Test
    public void 결과() {
        String answer = "gfedcbZ";
        String answer2 = "cbA";

        assertEquals(solution.solution("Zbcdefg"),answer);
        assertEquals(solution.solution("cAb"),answer2);
    }
}
