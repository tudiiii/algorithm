package 가장긴감소하는부분수열;


import org.junit.Assert;
import org.junit.Test;

public class Baekjoon_11722Test {

    Baekjoon_11722 s = new Baekjoon_11722();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(6,new int[]{10,30,10,20,20,10}), 3);
    }



}