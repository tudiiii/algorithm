import org.junit.Test;

import static org.junit.Assert.*;

public class IsIntegerRootTest {

    IsIntegerRoot solution = new IsIntegerRoot();

    @Test
    public void math함수확인(){
        assertEquals(4,solution.solution(2));
    }

    @Test
    public void 제곱일때의예시(){
        assertEquals(144,solution.solution(121));
    }

    @Test
    public void 제곱아닐때의예시(){
        assertEquals(-1,solution.solution(3));
    }


}