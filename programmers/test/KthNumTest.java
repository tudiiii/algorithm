import org.junit.Test;

import static org.junit.Assert.*;

public class KthNumTest {

    @Test
    public void main(){

        KthNum solution = new KthNum();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1}};
        int[] result = {5,6};

        assertArrayEquals(result,solution.solution(array,commands));
    }
}