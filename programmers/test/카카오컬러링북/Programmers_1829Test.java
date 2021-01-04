package 카카오컬러링북;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_1829Test {
    Programmers_1829 s = new Programmers_1829();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.solution(6,4,new int[][]{{1,1,1,0},{1,2,2,0},{1,0,01},{0,0,0,1},{0,0,0,3},{0,0,0,3}}), new int[]{4,5});
    }

}