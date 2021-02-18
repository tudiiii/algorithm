package 메뉴리뉴얼;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_72411Test {
    Programmers_72411 s = new Programmers_72411();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2,3,4}), new String[]{"AC", "ACDE", "BCFG", "CDE"});
        //Assert.assertArrayEquals(s.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2,3,5}), new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
        //Assert.assertArrayEquals(s.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2,3,4}), new String[]{"WX", "XY"});
    }

}