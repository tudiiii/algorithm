package 다음큰숫자;

import static org.junit.Assert.*;

import org.junit.Test;

public class programmers_12911Test {

    Programmers_12911 pr = new Programmers_12911();

    @Test
    public void test() {
        assertEquals(pr.solution(78), 83);
        assertEquals(pr.solution(15), 23);
    }

}