import org.junit.Assert;
import org.junit.Test;

public class HalloweenSaleTest {

    HalloweenSale s = new HalloweenSale();

    @Test
    public void testCase(){

        Assert.assertEquals(s.howManyGames(20,3,6,80),6);
        Assert.assertEquals(s.howManyGames(20,3,6,85),7);
    }

}