package 이중우선순위큐;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42628Test {

    Programmers_42628 s = new Programmers_42628();

    @Test
    public void test(){
        Assert.assertEquals(s.solution(new String[]{"I 16","D 1"}),new int[]{0,0});
        Assert.assertEquals(s.solution(new String[]{"I 7","I 5","I -5","D -1"}),new int[]{7,5});
    }

}