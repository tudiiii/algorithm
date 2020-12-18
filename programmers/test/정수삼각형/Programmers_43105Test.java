package 정수삼각형;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_43105Test {

    Programmers_43105 s = new Programmers_43105();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}),30);
    }

}