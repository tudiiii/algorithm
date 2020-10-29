import org.junit.Assert;
import org.junit.Test;
import 캐쉬.Programmers_17680;

public class Programmers_17680Test {

    Programmers_17680 s= new Programmers_17680();

    @Test
    public void test(){
        /*Assert.assertEquals(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}),50);
        Assert.assertEquals(s.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}),60);
        Assert.assertEquals(s.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}),21);
        Assert.assertEquals(s.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}),16);
        Assert.assertEquals(s.solution(2, new String[]{"Jeju", "Jeju", "Jeju", "Jeju"}),8);
        Assert.assertEquals(s.solution(0, new String[]{"Jeju", "Jeju", "Jeju", "Jeju"}),20);
        Assert.assertEquals(s.solution(3, new String[]{"Pangyo", "NewYork", "Seoul", "NewYork","Pangyo","NewYork"}),18);*/
        Assert.assertEquals(s.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}),52);
    }


}