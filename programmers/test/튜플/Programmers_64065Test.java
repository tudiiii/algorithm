package 튜플;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_64065Test {

    Programmers_64065 pr = new Programmers_64065();

    @Test
    public void test() {
        assertArrayEquals(pr.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}"), new int[]{2,1,3,4});
        assertArrayEquals(pr.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}"), new int[]{2,1,3,4});
        assertArrayEquals(pr.solution("{{20,111},{111}}"), new int[]{111,20});
        assertArrayEquals(pr.solution("{{123}}"), new int[]{123});
        assertArrayEquals(pr.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}"), new int[]{3,2,4,1});
    }

}