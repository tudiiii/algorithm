import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestNumByeTest {

    @Test
    public void 작은수제거한배열리턴() {

        SmallestNumBye solution = new SmallestNumBye();

        int arr[] = {4,3,2,1};
        int result[] = {4,3,2};

        assertArrayEquals(solution.solution(arr),result);
    }

    @Test
    public void 배열이빈경우() {

        SmallestNumBye solution = new SmallestNumBye();

        int arr[] = {10};
        int result[] = {-1};

        assertArrayEquals(solution.solution(arr),result);
    }
}