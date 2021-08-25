package 퍼즐조각채우기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_84021Test {

    Programmers_84021 s = new Programmers_84021();

    @Test
    public void test(){
        int[][] game_board = {{}};
        int[][] table = {{}};
        assertEquals(s.solution(game_board,table),14);
    }

}