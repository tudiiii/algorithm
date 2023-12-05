package 시소짝꿍;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_152996Test {

    Programmers_152996 pr = new Programmers_152996();

    @Test
    public void test1() {
        assertEquals(pr.solution(new int[]{100,180,360,100,270}),4);
    }

}