package 큰수만들기;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Programmers_42883_2Test {

    Programmers_42883_2 s = new Programmers_42883_2();

    @Test
    public void test(){
        assertEquals(s.solution("1924",2),"94");
        assertEquals(s.solution("1231234",3),"3234");
        assertEquals(s.solution("4177252841",4),"775841");
    }

}