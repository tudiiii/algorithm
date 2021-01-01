package 이중우선순위큐;

import org.junit.Assert;
import org.junit.Test;

public class Programmers_42628Test {

    Programmers_42628 s = new Programmers_42628();

    @Test
    public void test(){
        Assert.assertArrayEquals(s.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"}),new int[]{333, -45});
        Assert.assertArrayEquals(s.solution(new String[]{"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"}),new int[]{6, 5});
        Assert.assertArrayEquals(s.solution(new String[]{"I 7","I 5","I -5","D -1"}),new int[]{7,5});
    }

}