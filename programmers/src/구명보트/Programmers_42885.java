package 구명보트;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Programmers_42885 {
    public int solution(int[] people, int limit) {
        int boatCount = 0;
        Arrays.sort(people);
        Deque<Integer> dq = new LinkedList<>();

        for (int person : people) {
            dq.add(person);
        }

        int current =0;
        while (!dq.isEmpty()) {
            current = dq.pollLast();
            boatCount++;

            if(dq.isEmpty()) break;
            if (current + dq.getFirst() <= limit) {
                dq.pollFirst();
                continue;
            }

            if (current + dq.getLast() <= limit) {
                dq.pollLast();
            }
        }

        return boatCount;
    }
}
