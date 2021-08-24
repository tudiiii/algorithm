package 상호평가;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmer_83201Test {

    Programmer_83201 s = new Programmer_83201();

    @Test
    public void test(){

        int[][] result = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}};
        int[][] result2 = {{50,90},{50,87}};
        int[][] result3 = {{70,49,90},{68,50,38},{73,31,100}};

        assertEquals(s.solution(result),"FBABD");
        assertEquals(s.solution(result2),"DA");
        assertEquals(s.solution(result3),"CFD");
    }

}