
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhereKimTest {

    @Test
    public void case1(){

        WhereKim s = new WhereKim();

        String[] seoul = {"Jane","Kim"};
        assertEquals(s.solution(seoul),"김서방은 1에 있다");
    }


}