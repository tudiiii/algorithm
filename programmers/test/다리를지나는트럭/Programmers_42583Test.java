package 다리를지나는트럭;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42583Test {

    Programmers_42583 s = new Programmers_42583();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(2,10,new int[]{7,4,5,6}),8);
    }

}