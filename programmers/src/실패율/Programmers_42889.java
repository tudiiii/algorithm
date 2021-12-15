/*
정확성  테스트
테스트 1 〉	통과 (1.40ms, 71.1MB)
테스트 2 〉	통과 (3.37ms, 78.5MB)
테스트 3 〉	통과 (25.11ms, 81.8MB)
테스트 4 〉	통과 (105.13ms, 100MB)
테스트 5 〉	통과 (258.84ms, 91.8MB)
테스트 6 〉	통과 (4.08ms, 89.3MB)
테스트 7 〉	통과 (18.35ms, 83.8MB)
테스트 8 〉	통과 (94.42ms, 86.3MB)
테스트 9 〉	통과 (255.62ms, 88.9MB)
테스트 10 〉	통과 (75.63ms, 90.9MB)
테스트 11 〉	통과 (91.64ms, 93.6MB)
테스트 12 〉	통과 (91.21ms, 85.4MB)
테스트 13 〉	통과 (128.97ms, 104MB)
테스트 14 〉	통과 (1.47ms, 75.6MB)
테스트 15 〉	통과 (24.33ms, 91.8MB)
테스트 16 〉	통과 (18.92ms, 85.5MB)
테스트 17 〉	통과 (29.36ms, 87.6MB)
테스트 18 〉	통과 (19.29ms, 84.3MB)
테스트 19 〉	통과 (7.16ms, 73.4MB)
테스트 20 〉	통과 (32.10ms, 78.3MB)
테스트 21 〉	통과 (38.96ms, 97.3MB)
테스트 22 〉	통과 (223.27ms, 90.9MB)
테스트 23 〉	통과 (48.11ms, 85.7MB)
테스트 24 〉	통과 (77.81ms, 108MB)
테스트 25 〉	통과 (1.59ms, 77.6MB)
테스트 26 〉	통과 (1.33ms, 74.3MB)
테스트 27 〉	통과 (1.47ms, 75.7MB)
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
        int person;
        while(!queue.isEmpty()){
            if(level==N+1) break;

            person = 0;
            for (int stage : stages) {
                if (stage==level) {
                    person++;
                    queue.poll();
                }
            }
            failMap.put(level++,(double)person/queue.size());
        }

        while(level<=N)  failMap.put(level++,0.0);

        List<Integer> failSetList = new ArrayList<>(failMap.keySet());
        failSetList.sort((o1, o2) -> (failMap.get(o2).compareTo(failMap.get(o1))));
        int[] answer = new int[failSetList.size()];

        for(int i=0;i<failSetList.size();i++){
            answer[i] = failSetList.get(i);
        }

        return answer;
    }
}
