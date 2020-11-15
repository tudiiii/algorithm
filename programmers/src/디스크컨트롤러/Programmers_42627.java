/*
테스트 1 〉	통과 (3.99ms, 52.9MB)
테스트 2 〉	통과 (4.90ms, 53.7MB)
테스트 3 〉	통과 (3.58ms, 52.1MB)
테스트 4 〉	통과 (3.56ms, 52.3MB)
테스트 5 〉	통과 (3.47ms, 52.5MB)
테스트 6 〉	통과 (1.21ms, 53.2MB)
테스트 7 〉	통과 (4.47ms, 53.7MB)
테스트 8 〉	통과 (2.78ms, 52.2MB)
테스트 9 〉	통과 (2.15ms, 53MB)
테스트 10 〉	통과 (4.39ms, 52.8MB)
테스트 11 〉	통과 (1.54ms, 52.9MB)
테스트 12 〉	통과 (1.35ms, 53.2MB)
테스트 13 〉	통과 (4.40ms, 52MB)
테스트 14 〉	통과 (1.28ms, 53.7MB)
테스트 15 〉	통과 (1.39ms, 52.8MB)
테스트 16 〉	통과 (1.45ms, 52.5MB)
테스트 17 〉	통과 (1.45ms, 52MB)
테스트 18 〉	통과 (1.44ms, 52.1MB)
테스트 19 〉	통과 (1.29ms, 52.3MB)
테스트 20 〉	통과 (1.51ms, 51.7MB)
 */

package 디스크컨트롤러;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class Programmers_42627 {

    public int solution(int[][] jobs) {
        int answer = 0;
        int index = 0;
        int time = 0;
        int length = jobs.length;

        Queue<int[]> waiting = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]); // 대기 순서 대로 정렬

        // replaced with comparator.comparingInt
        // Queue<int[]> waiting = new PriorityQueue<>((Comparator.comparingInt(o -> o[1])));
        // Arrays.sort(jobs, Comparator.comparingInt(o -> o[0])); // 대기 순서 대로 정렬

        while(index < length || !waiting.isEmpty()){
            while(index < length && jobs[index][0] <= time){
                waiting.offer(jobs[index++]);
            }

            if(waiting.isEmpty()){
                time = jobs[index][0];
            }else {
                int[] job = waiting.poll();
                answer += time + job[1] - job[0];
                time += job[1]; // 작업 완료 시
            }
        }

        return answer/length;
    }
}
