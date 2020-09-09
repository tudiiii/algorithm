import org.junit.Test;
import static org.junit.Assert.*;

public class programmers_42862Test {

    programmers_42862 s = new programmers_42862();

    @Test
    public void test(){
       assertEquals(s.solution(5, new int[]{2, 4},new int[]{1,3,5}),5);
        assertEquals(s.solution(3, new int[]{1,2},new int[]{2,3}),2);
        assertEquals(s.solution(9, new int[]{2,4,7,8},new int[]{3,6,9}),8);
        assertEquals(s.solution(5, new int[]{2, 4},new int[]{3,5}),5);
        assertEquals(s.solution(6, new int[]{1,2,4},new int[]{2,3,4,5}),5);
        assertEquals(s.solution(5, new int[]{2,3},new int[]{3,4}),4);
        assertEquals(s.solution(5, new int[]{1},new int[]{3,4}),4);
        assertEquals(s.solution(5, new int[]{1,2,3,4,5},new int[]{1,2,3,4,5}),5);
        assertEquals(s.solution(3, new int[]{1,3},new int[]{1,2}),3);
        assertEquals(s.solution(8, new int[]{3,4,7},new int[]{1,3,5,6}),8);
        assertEquals(s.solution(6, new int[]{1,2,6},new int[]{2,3,4,5}),5);
        assertEquals(s.solution(8, new int[]{1,2,4,5,6,7},new int[]{2}),3);
        assertEquals(s.solution(5, new int[]{2,4},new int[]{3}),4);
    }

}