package 숫자문자열과영단어;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmer_81301Test {
    Programmer_81301 s = new Programmer_81301();

    @Test
    public void 기본_테스트(){
        assertEquals(s.solution("one4seveneight"),1478);
        assertEquals(s.solution("23four5six7"),234567);
        assertEquals(s.solution("2three45sixseven"),234567);
        assertEquals(s.solution("123"),123);
    }
}