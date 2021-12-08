/*
## 프린터
테스트 1 〉	통과 (0.49ms, 77.3MB)
테스트 2 〉	통과 (0.93ms, 69.1MB)
테스트 3 〉	통과 (0.47ms, 75MB)
테스트 4 〉	통과 (0.40ms, 77.4MB)
테스트 5 〉	통과 (0.35ms, 75.3MB)
테스트 6 〉	통과 (0.58ms, 82.3MB)
테스트 7 〉	통과 (0.47ms, 78.2MB)
테스트 8 〉	통과 (0.76ms, 75.4MB)
테스트 9 〉	통과 (0.40ms, 73.1MB)
테스트 10 〉	통과 (0.50ms, 79.1MB)
테스트 11 〉	통과 (1.09ms, 94.2MB)
테스트 12 〉	통과 (0.43ms, 74.5MB)
테스트 13 〉	통과 (0.68ms, 74.6MB)
테스트 14 〉	통과 (0.37ms, 69.4MB)
테스트 15 〉	통과 (0.40ms, 82.5MB)
테스트 16 〉	통과 (0.42ms, 77.2MB)
테스트 17 〉	통과 (1.07ms, 81.8MB)
테스트 18 〉	통과 (0.46ms, 76.9MB)
테스트 19 〉	통과 (0.72ms, 72.7MB)
테스트 20 〉	통과 (0.57ms, 73.4MB)
 */

package 프린터;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Programmers_42587_2 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int priority : priorities) {
            priorityQueue.add(priority);
        }

        while (!priorityQueue.isEmpty()) {
            for(int i=0;i<priorities.length;i++)
                if (priorities[i] == priorityQueue.peek()) {
                    answer++;
                    priorityQueue.poll();

                    if (location == i) {
                        return answer;
                    }
                }
        }

        return answer;
    }
}
