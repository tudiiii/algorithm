package 오픈채팅방;

import org.junit.Test;

import static org.junit.Assert.*;

public class Programmers_42888Test {

    Programmers_42888 s = new Programmers_42888();

    @Test
    public void test(){
        assertArrayEquals(s.solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}), new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }
}