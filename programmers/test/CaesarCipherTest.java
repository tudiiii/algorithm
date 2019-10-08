import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {
    @Test
    public void 결과(){
        CaesarCipher solution = new CaesarCipher();

        assertEquals("BC",solution.solution("AB",1));
        assertEquals("a",solution.solution("z",1));
        assertEquals("e F d",solution.solution("a B z",4));
    }
}
