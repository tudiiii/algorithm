package 비밀지도;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmeres_17681Test {

    Programmeres_17681 s = new Programmeres_17681();

    @Test
    public void test(){
        assertArrayEquals(s.solution(5, new int[]{9,20,28,18,11}, new int[]{30,1,21,17,28}), new String[]{"#####","# # #", "### #", "#  ##", "#####"});
        assertArrayEquals(s.solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}), new String[]{"######", "### #", "## ##", " #### ", " #####", "### # "});
    }
}