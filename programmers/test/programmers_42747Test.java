import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class programmers_42747Test {

    programmers_42747 s = new programmers_42747();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[]{3, 0, 6, 1, 5}),3);
        Assert.assertEquals(s.solution(new int[]{5, 5, 5, 5}),4);
    }

}