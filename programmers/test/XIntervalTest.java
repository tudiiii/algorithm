import org.junit.Test;

import static org.junit.Assert.*;

public class XIntervalTest {

    XInterval solution = new XInterval();
    @Test
    public void 양의정수() {
        long[] answer = {2,4,6,8,10};
        assertArrayEquals(answer,solution.solution(2,5));
    }

    @Test
    public void 음의정수() {
        long[] answer = {-4,-8};
        assertArrayEquals(answer,solution.solution(-4,2));
    }


}