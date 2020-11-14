/*
테스트 1 〉	통과 (0.70ms, 54.3MB)
테스트 2 〉	통과 (1.21ms, 52.8MB)
테스트 3 〉	통과 (0.76ms, 52.2MB)
테스트 4 〉	통과 (0.41ms, 52.3MB)
테스트 5 〉	통과 (0.57ms, 52.6MB)
테스트 6 〉	통과 (0.83ms, 53MB)
테스트 7 〉	통과 (0.74ms, 53.3MB)
테스트 8 〉	통과 (1.11ms, 52.9MB)
테스트 9 〉	통과 (0.43ms, 52.1MB)
테스트 10 〉	통과 (0.83ms, 52.5MB)
테스트 11 〉	통과 (1.05ms, 54.1MB)
테스트 12 〉	통과 (0.45ms, 52.6MB)
테스트 13 〉	통과 (0.97ms, 52.3MB)
테스트 14 〉	통과 (0.56ms, 52.3MB)
테스트 15 〉	통과 (0.57ms, 52.8MB)
테스트 16 〉	통과 (0.63ms, 52.6MB)
테스트 17 〉	통과 (1.51ms, 53MB)
테스트 18 〉	통과 (0.69ms, 52.4MB)
테스트 19 〉	통과 (0.97ms, 52.8MB)
테스트 20 〉	통과 (0.93ms, 53.1MB)
 */

package 프린터;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Programmers_42587 {
    public int solution(int[] priorities, int location) {

        int answer = 1;
        int length = priorities.length;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int priority : priorities) {
            priorityQueue.offer(priority);
        }

        while(!priorityQueue.isEmpty()){
            for(int i=0;i<length;i++){
                if (priorities[i] == priorityQueue.peek()) {
                    if (location == i) {
                        return answer;
                    }
                    answer++;
                    priorityQueue.poll();
                }
            }
        }
        return answer;
    }
}
