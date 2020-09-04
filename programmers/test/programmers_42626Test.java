import org.junit.Assert;
import org.junit.Test;

public class programmers_42626Test {

    programmers_42626 s = new programmers_42626();

    @Test
    public void 입출력예(){
        int[] scoville = {1,2,3,9,10,12};
        int K = 7;
        int expected = 2;

        Assert.assertEquals(s.solution(scoville,K),expected);

    }


}