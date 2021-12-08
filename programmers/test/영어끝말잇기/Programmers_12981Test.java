package 영어끝말잇기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_12981Test {
    Programmers_12981 s = new Programmers_12981();

    @Test
    public void 기본_테스트_케이스(){
        assertArrayEquals(s.solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}), new int[]{3,3});
        assertArrayEquals(s.solution(5,new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}), new int[]{0,0});
        assertArrayEquals(s.solution(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"}), new int[]{1,3});
    }


}