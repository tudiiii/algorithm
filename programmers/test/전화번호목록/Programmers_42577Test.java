package 전화번호목록;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42577Test {

    Programmers_42577 s = new Programmers_42577();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new String[]{"119", "97674223", "1195524421"}),false);
        Assert.assertEquals(s.solution(new String[]{"123","456","789"}),true);
        Assert.assertEquals(s.solution(new String[]{"12","123","1235","567","88"}),false);
    }

}