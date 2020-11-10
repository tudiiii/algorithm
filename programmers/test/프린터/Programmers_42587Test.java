package 프린터;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42587Test {

    Programmers_42587 s = new Programmers_42587();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[]{2, 1, 3, 2},2),1);
    }

}