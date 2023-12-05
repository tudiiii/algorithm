package 귤고르기;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Programmers_138476 {
    public int solution(int k, int[] tangerine) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        for (Integer key : map.keySet()) {
            pq.add(map.get(key));
        }

        int count=0;
        while (k>0) {
            count++;

            if (pq.peek() > k) {
                break;
            }

            k -= pq.poll();
        }

        return count;
    }
}