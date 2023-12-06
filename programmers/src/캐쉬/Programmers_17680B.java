
package 캐쉬;

import java.util.LinkedList;
import java.util.Queue;

public class Programmers_17680B {
    public int solution(int cacheSize, String[] cities) {
        int answer=0;
        Queue<String> queue = new LinkedList<>();

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String s : cities) {
            String city = s.toLowerCase();

            if (queue.contains(city)) {
                answer += 1;
                queue.remove(city);
            } else {
                answer += 5;

                if (queue.size() >= cacheSize) {
                    queue.poll();
                }
            }

            queue.add(city);
        }

        return answer;
    }
}

