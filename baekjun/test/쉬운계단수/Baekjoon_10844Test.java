package 쉬운계단수;

import etc.쉬운계단수.Baekjoon_10844;
import org.junit.Assert;
import org.junit.Test;

public class Baekjoon_10844Test {

    Baekjoon_10844 s = new Baekjoon_10844();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(1),9);
        Assert.assertEquals(s.solution(2),17);
    }

}