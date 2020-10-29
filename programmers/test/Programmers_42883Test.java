import org.junit.Assert;
import org.junit.Test;
import 큰수만들기.Programmers_42883;

public class Programmers_42883Test {

    Programmers_42883 s = new Programmers_42883();

    @Test
    public void test(){
        Assert.assertEquals(s.solution("1924",2),"94");
        Assert.assertEquals(s.solution("1231234",3),"3234");
        Assert.assertEquals(s.solution("4177252841",4),"775841");
    }

}