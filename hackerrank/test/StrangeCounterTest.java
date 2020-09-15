import org.junit.Assert;
import org.junit.Test;

public class StrangeCounterTest {

    StrangeCounter s  = new StrangeCounter();

    @Test
    public void test(){
//        Assert.assertEquals(s.strangeCounter(4),6);
        Assert.assertEquals(s.strangeCounter(17),5);
    }

}