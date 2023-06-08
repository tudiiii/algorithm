package 과제진행하기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers176962Test {

    Programmers_176962 pr = new Programmers_176962();

    @Test
    public void test() {

        String[][] plan = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        String [] result = {"science", "history", "computer", "music"};

        assertArrayEquals(pr.solution(plan), result);
    }

    @Test
    public void test2() {

        String[][] plan = {{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};
        String [] result = {"bbb", "ccc", "aaa"};

        assertArrayEquals(pr.solution(plan), result);
    }

    @Test
    public void test3() {

        String[][] plan =  {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        String [] result = {"korean", "english", "math"};

        assertArrayEquals(pr.solution(plan), result);
    }

}