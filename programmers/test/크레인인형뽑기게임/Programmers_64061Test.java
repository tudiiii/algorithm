package 크레인인형뽑기게임;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_64061Test {

    Programmers_64061 s = new Programmers_64061();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}),4);
    }

}