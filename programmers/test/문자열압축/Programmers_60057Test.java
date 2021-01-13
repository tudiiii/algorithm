package 문자열압축;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_60057Test {

    Programmers_60057 s = new Programmers_60057();

    @Test
    public void test(){
        Assert.assertEquals(s.solution("aabbaccc"),7);
        Assert.assertEquals(s.solution("ababcdcdababcdcd"),9);
    }

}