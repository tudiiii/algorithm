import org.junit.Assert;
import org.junit.Test;
import 하샤드수.Programmers_68966;

public class Programmers_68966Test {

    Programmers_68966 s = new Programmers_68966();

    @Test
    public void test(){
        Assert.assertTrue(s.solution(10));
        Assert.assertFalse(s.solution(13));
        Assert.assertTrue(s.solution(12));
        Assert.assertFalse(s.solution(11));
    }

}