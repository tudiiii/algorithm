
import java.util.PriorityQueue;
import java.util.Queue;

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
