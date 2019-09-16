
import org.junit.Assert;
import org.junit.Test;

public class BigNumTest {

    @Test
    public void case1(){

        BigNum s = new BigNum();

        int[] numbers = {6,10,2};
        String result = "6210";

        Assert.assertEquals(s.solution(numbers),result);
    }

    @Test
    public void case2(){

        BigNum s = new BigNum();

        int[] numbers = {3,30,34,5,9};
        String result = "9534330";

        Assert.assertEquals(s.solution(numbers),result);
    }

    @Test
    public void case3_0일때(){

        BigNum s = new BigNum();

        int[] numbers = {0,0,0};
        String result = "0";

        Assert.assertEquals(s.solution(numbers),result);
    }
}