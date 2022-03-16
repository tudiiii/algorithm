package 수들의합;

import org.junit.Test;

import static org.junit.Assert.*;

public class B_1789Test {

    B_1789 b  = new B_1789();

    @Test
    public void test(){
        assertEquals(b.searchNum(200),19);
        assertEquals(b.searchNum(10),4);    }

}