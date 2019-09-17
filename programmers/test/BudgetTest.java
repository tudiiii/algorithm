import org.junit.Test;

import static org.junit.Assert.*;

public class BudgetTest {

    @Test
    public void 결과(){
        Budget b = new Budget();
        int[] d = {1,3,2,5,4};
        int budget=9;

        assertEquals(3,b.solution(d, budget));
    }

    @Test
    public void 결과2(){
        Budget b = new Budget();
        int[] d = {4,2,4,2};
        int budget=12;

        assertEquals(4,b.solution(d, budget));
    }
}