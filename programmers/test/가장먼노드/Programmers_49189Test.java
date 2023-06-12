package 가장먼노드;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_49189Test {

    Programmers_49189 pr = new Programmers_49189();

    @Test
    public void test() {
        int n = 6;
        int[][] edge = 	new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int result = 3;

        assertEquals(pr.solution(n, edge), result);
    }

}