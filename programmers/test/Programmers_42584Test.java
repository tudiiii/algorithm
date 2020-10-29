import org.junit.Assert;
import org.junit.Test;

public class Programmers_42584Test {

    Programmers_42584 s = new Programmers_42584();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[]{1, 2, 3, 2, 3}),new int[]{4, 3, 1, 1, 0});
        Assert.assertEquals(s.solution(new int[]{3,7,4,2,1}),new int[]{2,1,2,1,0});
    }

}