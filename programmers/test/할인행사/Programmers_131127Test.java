package 할인행사;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Programmers_131127Test {

    Programmers_131127 pr = new Programmers_131127();

    @Test
    public void test() {
        assertEquals(pr.solution(
            new String[]{"banana", "apple", "rice", "pork", "pot"},
            new int[]{3,2,2,2,1},
            new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}), 3);

        assertEquals(pr.solution(
            new String[]{"apple"},
            new int[]{10},
            new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}), 0);

        assertEquals(pr.solution(
            new String[]{"banana", "apple", "rice", "pork", "pot"},
            new int[]{3,2,2,2,1},
            new String[]{"apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana", "chicken", "apple"}), 3);
    }

}