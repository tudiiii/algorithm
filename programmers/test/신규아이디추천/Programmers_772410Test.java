package 신규아이디추천;

import org.junit.Assert;
import org.junit.Test;

public class Programmers_772410Test {

    Programmers_772410 s = new Programmers_772410();

    @Test
    public void test(){
        Assert.assertEquals(s.solution("...!@BaT#*..y.abcdefghijklm"),"bat.y.abcdefghi");
        Assert.assertEquals(s.solution("z-+.^."),"z--");
        Assert.assertEquals(s.solution("=.="),"aaa");
        Assert.assertEquals(s.solution("123_..|def"),"123_.def");
        Assert.assertEquals(s.solution("abcdefghijklmn.p"),"abcdefghijklmn");
    }

}