package 단어변환;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_43163Test {

    Programmers_43163 s = new Programmers_43163();

    @Test
    public void test(){
        assertEquals(s.solution("hit","cog",new String[]{"hot","dot","dog","lot","dog","cog"}),4);
        assertEquals(s.solution("hit","cog",new String[]{"hot","dot","dog","lot","dog"}),0);
    }

}