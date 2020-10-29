import org.junit.Assert;
import org.junit.Test;
import 모의고사.programmers_42840;

public class programmers_42840Test {

    programmers_42840 s = new programmers_42840();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[]{1,3,2,4,2}), new int[]{1,2,3});
        Assert.assertEquals(s.solution(new int[]{1,2,3,4,5}), new int[]{1});
    }

}