package 이중우선순위큐;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Programmers_42628 {
    /*
    테스트 1 〉	통과 (0.69ms, 51.6MB)
    테스트 2 〉	통과 (0.68ms, 53MB)
    테스트 3 〉	통과 (0.75ms, 52.9MB)
    테스트 4 〉	통과 (0.44ms, 51.8MB)
    테스트 5 〉	통과 (0.71ms, 52.7MB)
    테스트 6 〉	통과 (0.83ms, 53.2MB)
     */
    public int[] solution(String[] operations) {
        Queue<Integer> ascQueue = new PriorityQueue<>(); // 작은수부터 정렬
        Queue<Integer> descQueue = new PriorityQueue<>(Collections.reverseOrder()); // 큰수부터 정렬

        for (String s : operations) {
            String[] operation = s.split(" ");
            if ("I".equals(operation[0])) {
                ascQueue.add(Integer.valueOf(operation[1]));
                descQueue.add(Integer.valueOf(operation[1]));
            } else {
                if ("1".equals(operation[1])) { // 1일때 최댓값 삭제
                    ascQueue.remove(descQueue.poll());
                } else { // -1일때 최솟값 삭제
                    descQueue.remove(ascQueue.poll());
                }
            }
        }

        if(ascQueue.isEmpty() || descQueue.isEmpty()){
            return new int[]{0,0};
        }

        return new int[]{descQueue.poll(),ascQueue.poll()};
    }
}
