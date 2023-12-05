package 이진변환반복하기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_70129Test {

    Programmers_70129 pr = new Programmers_70129();

    @Test
    public void test() {
        assertArrayEquals(pr.solution("110010101001"), new int[]{3, 8});
        assertArrayEquals(pr.solution("01110"), new int[]{3, 3});
        assertArrayEquals(pr.solution("1111111"), new int[]{4, 1});
    }
}