package 의상;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_42578BTest {

    Programmers_42578B pr = new Programmers_42578B();

    @Test
    public void test() {
        String[][] clothes = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = 5;

        assertEquals(pr.solution(clothes), result);
    }

    @Test
    public void test2() {
        String[][] clothes = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int result = 3;

        assertEquals(pr.solution(clothes), result);
    }
}