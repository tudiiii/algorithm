package 캐쉬;

import static org.junit.Assert.*;

import org.junit.Test;

public class Programmers_17680BTest {

    Programmers_17680B pr = new Programmers_17680B();

    @Test
    public void test() {
        assertEquals(pr.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 50);
        assertEquals(pr.solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}), 21);
        assertEquals(pr.solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), 60);
        assertEquals(pr.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}), 52);
        assertEquals(pr.solution(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"}), 16);
        assertEquals(pr.solution(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}), 25);
        assertEquals(pr.solution(5, new String[]{"leo","leo","leo"}), 7);
        assertEquals(pr.solution(5, new String[]{"leo","leol","leoll"}), 15);
        assertEquals(pr.solution(5, new String[]{"leo","leo","leo","leo","leo"}), 9);
        assertEquals(pr.solution(0, new String[]{"leo","leo","leo","leo","leo"}), 25);
    }

}