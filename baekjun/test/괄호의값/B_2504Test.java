package 괄호의값;

import org.junit.Test;
import 자료구조.괄호의값.B_2504;

import static org.junit.Assert.*;

public class B_2504Test {

    B_2504 b = new B_2504();

    @Test
    public void test(){
        assertEquals(b.solution("(()[[]])([])"),28);
        assertEquals(b.solution("[][]((])"),0);
    }

}