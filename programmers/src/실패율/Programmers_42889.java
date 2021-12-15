/*
정확성  테스트
테스트 1 〉	통과 (1.26ms, 76.8MB)
테스트 2 〉	통과 (3.14ms, 73MB)
테스트 3 〉	통과 (39.50ms, 89.6MB)
테스트 4 〉	통과 (154.40ms, 100MB)
테스트 5 〉	통과 (462.38ms, 117MB)
테스트 6 〉	통과 (6.10ms, 76.6MB)
테스트 7 〉	통과 (24.92ms, 91.6MB)
테스트 8 〉	통과 (168.23ms, 105MB)
테스트 9 〉	통과 (446.95ms, 115MB)
테스트 10 〉	통과 (129.85ms, 84.3MB)
테스트 11 〉	통과 (107.64ms, 102MB)
테스트 12 〉	통과 (138.18ms, 87.9MB)
테스트 13 〉	통과 (221.10ms, 103MB)
테스트 14 〉	통과 (1.65ms, 79.7MB)
테스트 15 〉	통과 (35.18ms, 88.4MB)
테스트 16 〉	통과 (29.57ms, 93.4MB)
테스트 17 〉	통과 (36.52ms, 80.4MB)
테스트 18 〉	통과 (48.35ms, 86MB)
테스트 19 〉	통과 (10.64ms, 77.1MB)
테스트 20 〉	통과 (36.07ms, 84.6MB)
테스트 21 〉	통과 (42.20ms, 97.2MB)
테스트 22 〉	통과 (489.29ms, 96.9MB)
테스트 23 〉	통과 (80.48ms, 90.1MB)
테스트 24 〉	통과 (107.93ms, 108MB)
테스트 25 〉	통과 (1.33ms, 71.6MB)
테스트 26 〉	통과 (1.55ms, 76.5MB)
테스트 27 〉	통과 (1.24ms, 77.8MB)
 */
package 실패율;

import java.util.*;

public class Programmers_42889 {
    public int[] solution(int N, int[] stages) {

        Arrays.sort(stages);
        Queue<Integer> queue = new PriorityQueue<>();
        Map<Integer,Double> failMap = new HashMap<>();

        for(int stage : stages){
            queue.add(stage);
        }

        int level = 1;
        while(!queue.isEmpty()){
            if(level==N+1) break;

            int cnt = 0;
            for (int stage : stages) {
                if (stage == queue.peek() && stage<=N && stage==level) {
                    cnt++;
                    queue.poll();
                }
            }

            failMap.put(level++,(double)cnt/queue.size());

            if(queue.isEmpty()&&level<=N){
                while(level<=N)
                    failMap.put(level++,0.0);
            }

        }

        List<Integer> failSetList = new ArrayList<>(failMap.keySet());
        failSetList.sort((o1, o2) -> (failMap.get(o2).compareTo(failMap.get(o1))));
        int[] answer = new int[failSetList.size()];

        for(int i=0;i<failSetList.size();i++){
            answer[i] = failSetList.get(i);
        }

        return answer;
    }
}
