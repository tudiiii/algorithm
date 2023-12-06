package HIndex;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_42747BTest {

    Programmers_42747B pr = new Programmers_42747B();

    @Test
    public void test() {
       assertEquals(pr.solution(new int[]{3,0,6,1,5}),3);
    }

}