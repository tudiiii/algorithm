import org.junit.Test;

import static org.junit.Assert.*;

public class CrazyNumTest {

    CrazyNum solution = new CrazyNum();
    CrazyNum2 solution2 = new CrazyNum2();

    @Test
    public void solution() {
        String answer = "TrY HeLlO WoRlD";
        assertEquals(answer,solution.solution("try hello world"));
        assertEquals(answer,solution2.solution("try hello world"));
    }

    @Test
    public void solution2() {
        String answer = "Hi My NaMeE Is TuDiIiI";
        assertEquals(answer,solution.solution("hi my namee is tudiiii"));
        assertEquals(answer,solution2.solution("hi my namee is tudiiii"));
    }
}