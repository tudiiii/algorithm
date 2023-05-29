package 동전1;

import etc.동전1.B_2293;
import org.junit.Test;

import static org.junit.Assert.*;

public class B_2293Test {

    B_2293 b = new B_2293();

    @Test
    public void test(){
        assertEquals(b.makeWon(new int[]{3,1,2,5},10),10);
    }

}