package 행렬의곱셈;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Programmers_12949Test {

    Programmers_12949 pr = new Programmers_12949();

    @Test
    public void test() {
        assertArrayEquals(pr.solution(
            new int[][]{{1,4}, {3,2}, {4,1}},
            new int[][]{{3,3}, {3,3}}
        ), new int[][]{{15,15}, {15,15}, {15,15}});

        assertArrayEquals(pr.solution(
            new int[][]{{2,3,2}, {4,2,4}, {3,1,4}},
            new int[][]{{5,4,3}, {2,4,1}, {3,1,1}}
        ), new int[][]{{22,22,11}, {36,28,18}, {29,20,14}});
    }

}