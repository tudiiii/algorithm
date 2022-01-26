package 신고결과받기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_92334Test {

    Programmers_92334 s = new Programmers_92334();

    @Test
    public void test(){
        assertArrayEquals(s.solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2), new int[]{2,1,1,0});
        assertArrayEquals(s.solution(new String[]{"con", "ryan"}, new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},3), new int[]{0,0});
    }

}