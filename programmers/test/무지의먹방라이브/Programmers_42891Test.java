package 무지의먹방라이브;

import org.junit.Assert;
import org.junit.Test;

public class Programmers_42891Test {

    Programmers_42891 s = new Programmers_42891();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new int[]{3,1,2},5),1);
        Assert.assertEquals(s.solution(new int[]{4,2,3,6,7,1,5,8},16),3);
        Assert.assertEquals(s.solution(new int[]{4,2,3,6,7,1,5,8},27),5);
        Assert.assertEquals(s.solution(new int[]{4,3,5,6,2},7),3);
        Assert.assertEquals(s.solution(new int[]{1,1,1,1},4),-1);
        Assert.assertEquals(s.solution(new int[]{5,6,2,5,2},14),2);
    }

}