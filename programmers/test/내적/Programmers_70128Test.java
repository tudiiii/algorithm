package 내적;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_70128Test {
    Programmers_70128 s = new Programmers_70128();

    @Test
    public void test(){
        assertEquals(s.solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}),3);
        assertEquals(s.solution(new int[]{-1,0,1}, new int[]{1,0,-1}),-2);
    }
}