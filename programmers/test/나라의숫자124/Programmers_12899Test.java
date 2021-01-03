package 나라의숫자124;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_12899Test {

    Programmers_12899 s = new Programmers_12899();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(1),1);
        Assert.assertEquals(s.solution(2),2);
        Assert.assertEquals(s.solution(3),4);
        Assert.assertEquals(s.solution(4),11);
    }

}