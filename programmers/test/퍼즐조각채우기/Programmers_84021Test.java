package 퍼즐조각채우기;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_84021Test {

    Programmers_84021 s = new Programmers_84021();

    @Test
    public void test(){

        int[][] game_board = {{1,1,0,0,1,0},{0,0,1,0,1,0},{0,1,1,0,0,1},{1,1,0,1,1,1},{1,0,0,0,1,0},{0,1,1,1,0,0}};
        int[][] table = {{1,0,0,1,1,0},{1,0,1,0,1,0},{0,1,1,0,1,1},{0,0,1,0,0,0},{1,1,0,1,1,0},{0,1,0,0,0,0}};

        int[][] game_board2 = {{0,0,0},{1,1,0},{1,1,}};
        int[][] table2 = {{1,1,1},{1,0,0},{0,0,0}};

        assertEquals(s.solution(game_board,table),14);
        assertEquals(s.solution(game_board2,table2),0);
    }

}