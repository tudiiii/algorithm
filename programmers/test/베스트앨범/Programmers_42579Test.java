package 베스트앨범;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42579Test {

    Programmers_42579 s = new Programmers_42579();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"},new int[]{500, 600, 150, 800, 2500}),new int[]{4, 1, 3, 0});
        //Assert.assertArrayEquals(s.solution(new String[]{"A", "A", "B", "A"},new int[]{5, 5, 6, 5}),new int[]{0,1,2});
    }
}