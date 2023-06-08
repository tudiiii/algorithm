package 달리기경주;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_178871Test {

    Programmers_178871 pr = new Programmers_178871();

    @Test
    public void test() {
        String[] players = new String[]{"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = new String[]{"kai", "kai", "mine", "mine"};

        String[] result = new String[]{"mumu", "kai", "mine", "soe", "poe"};

        assertArrayEquals(pr.solution(players, callings), result);
    }

}