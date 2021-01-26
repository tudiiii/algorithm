package K번째수;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Programmers_42748Test {

    @Test
    public void main(){

        Programmers_42748 solution = new Programmers_42748();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1}};
        int[] result = {5,6};

        assertArrayEquals(result,solution.solution(array,commands));
    }
}