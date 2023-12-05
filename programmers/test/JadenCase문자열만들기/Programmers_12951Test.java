package JadenCase문자열만들기;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_12951Test {

    Programmers_12951 pr = new Programmers_12951();

    @Test
    public void test() {
        assertEquals(pr.solution("3people unFollowed me"), "3people Unfollowed Me");
        assertEquals(pr.solution("for the last week"), "For The Last Week");
        assertEquals(pr.solution("for    the last week"), "For    The Last Week");
        assertEquals(pr.solution("  for the what 1what "), "  For The What 1what ");
    }

}