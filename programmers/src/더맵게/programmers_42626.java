/*
정확성  테스트
테스트 1 〉	통과 (0.41ms, 53.2MB)
테스트 2 〉	통과 (0.44ms, 52.4MB)
테스트 3 〉	통과 (0.44ms, 52MB)
테스트 4 〉	통과 (0.42ms, 53.3MB)
테스트 5 〉	통과 (0.43ms, 52.7MB)
테스트 6 〉	통과 (3.36ms, 53.4MB)
테스트 7 〉	통과 (2.60ms, 52.6MB)
테스트 8 〉	통과 (1.09ms, 51.5MB)
테스트 9 〉	통과 (0.93ms, 52.2MB)
테스트 10 〉	통과 (2.82ms, 52.5MB)
테스트 11 〉	통과 (1.91ms, 52.9MB)
테스트 12 〉	통과 (4.05ms, 52.8MB)
테스트 13 〉	통과 (2.42ms, 52.2MB)
테스트 14 〉	통과 (0.53ms, 53MB)
테스트 15 〉	통과 (13.28ms, 52.3MB)
테스트 16 〉	통과 (0.42ms, 52.1MB)
효율성  테스트
테스트 1 〉	통과 (162.62ms, 68MB)
테스트 2 〉	통과 (259.40ms, 81.8MB)
테스트 3 〉	통과 (1278.10ms, 115MB)
테스트 4 〉	통과 (110.38ms, 62.9MB)
테스트 5 〉	통과 (1399.99ms, 116MB)
 */

package 더맵게;
import java.util.PriorityQueue;

public class programmers_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> sc = new PriorityQueue<>(scoville.length);

        for(int aScoville:scoville){
            sc.offer(aScoville);
        }

        while(sc.peek()<=K){
            if(sc.size()==1){
                answer = -1;
                break;
            }

            int a = sc.poll();
            int b = sc.poll();

            int result = a+(b*2);
            sc.offer(result);
            answer++;

        }

        return answer;
     }
}
