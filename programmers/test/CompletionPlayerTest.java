import org.junit.Test;

import static org.junit.Assert.*;

public class CompletionPlayerTest {

    CompletionPlayer s = new CompletionPlayer();

    @Test
    public void 결과(){
        String[] participant = {"leo","kiki","eden"};
        String[] completion = {"eden","kiki"};
        assertEquals(s.solution(participant,completion),"leo");
    }


}