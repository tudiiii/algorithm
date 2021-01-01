package 카펫;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42842Test {
    Programmers_42842 s = new Programmers_42842();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(10,2), new int[]{4,2});
        Assert.assertEquals(s.solution(8,1), new int[]{3,3});
        Assert.assertEquals(s.solution(24,24), new int[]{8,6});
    }

}