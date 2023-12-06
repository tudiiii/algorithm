package N제곱배열자르기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_87390Test {

    Programmers_87390 pr = new Programmers_87390();

    @Test
    public void test() {
        assertArrayEquals(pr.solution(3,2,5), new int[]{3,2,2,3});
        assertArrayEquals(pr.solution(4,7,14), new int[]{4,3,3,3,4,4,4,4});
    }

}