import org.junit.Test;

import static org.junit.Assert.*;

public class programmers_42862Test {

    programmers_42862 s = new programmers_42862();

    @Test
    public void 여벌체육복이많을때(){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int expected = 5;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 여벌체육복이적을때(){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};
        int expected = 4;

        assertEquals(s.solution(n,lost,reserve),expected);
    }
    
    @Test
    public void 여벌체육복을_가지고있는_앞번호나뒷번호가_없을때(){
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int expected = 2;

        assertEquals(s.solution(n,lost,reserve),expected);
    }


    @Test
    public void 여벌체육복을_가져온_학생이_도난당했을때(){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {2};
        int expected = 4;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 아무도빌려줄수없을때(){
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};
        int expected = 2;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 테스트12(){
        int n = 3;
        int[] lost = {1,2};
        int[] reserve = {2,3};
        int expected = 2;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 테스트13(){
        int n = 3;
        int[] lost = {1,2};
        int[] reserve = {1,2};
        int expected = 3;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 테스트14(){
        int n = 5;
        int[] lost = {1,2,3,4,5};
        int[] reserve = {1,2,3,4,5};
        int expected = 5;

        assertEquals(s.solution(n,lost,reserve),expected);
    }

    @Test
    public void 테스트15(){
        int n = 10;
        int[] lost = {1,3,4,5};
        int[] reserve = {2,9};
        int expected = 7;

        assertEquals(s.solution(n,lost,reserve),expected);
    }


}