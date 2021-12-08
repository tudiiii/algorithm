/*
## 프린터
테스트 1 〉	통과 (0.48ms, 74.6MB)
테스트 2 〉	통과 (0.85ms, 76.9MB)
테스트 3 〉	통과 (0.69ms, 75.7MB)
테스트 4 〉	통과 (0.40ms, 74.6MB)
테스트 5 〉	통과 (0.36ms, 75.8MB)
테스트 6 〉	통과 (0.55ms, 80.6MB)
테스트 7 〉	통과 (0.50ms, 81.5MB)
테스트 8 〉	통과 (0.76ms, 73.4MB)
테스트 9 〉	통과 (0.46ms, 74.3MB)
테스트 10 〉	통과 (0.49ms, 73.2MB)
테스트 11 〉	통과 (0.71ms, 75.6MB)
테스트 12 〉	통과 (0.39ms, 73.9MB)
테스트 13 〉	통과 (1.04ms, 70.1MB)
테스트 14 〉	통과 (0.35ms, 77.3MB)
테스트 15 〉	통과 (0.38ms, 79.3MB)
테스트 16 〉	통과 (0.47ms, 74.2MB)
테스트 17 〉	통과 (0.82ms, 77MB)
테스트 18 〉	통과 (0.42ms, 75.5MB)
테스트 19 〉	통과 (0.70ms, 78.2MB)
테스트 20 〉	통과 (0.47ms, 77.3MB)
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
            for(int i=0;i<priorities.length;i++) {
                if (priorities[i] != priorityQueue.peek()) {
                    continue;
                }
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
