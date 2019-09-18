import org.junit.Test;

import static org.junit.Assert.*;

public class StringBasicTest {

    @Test
    public void false일때(){

        StringBasic solution = new StringBasic();

        String a = "a234";
        assertTrue(String.valueOf(false),solution.solution(a));
    }

    @Test
    public void true일때(){

        StringBasic solution = new StringBasic();

        String a = "456";
        assertTrue(String.valueOf(false),solution.solution(a));
    }
}