package 디스크컨트롤러;

import org.junit.Assert;
import org.junit.Test;

public class Programmers_42627Test {

    Programmers_42627 s = new Programmers_42627();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[][]{{0,3},{1,9},{2,6}}),9);
    }

}