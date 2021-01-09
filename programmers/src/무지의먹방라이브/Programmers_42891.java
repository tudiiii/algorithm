package 무지의먹방라이브;
import java.util.*;

public class Programmers_42891 {
/*
정확성  테스트
테스트 1 〉	통과 (1.21ms, 52.1MB)
테스트 2 〉	통과 (1.70ms, 52.3MB)
테스트 3 〉	통과 (1.23ms, 52.9MB)
테스트 4 〉	통과 (0.84ms, 52.6MB)
테스트 5 〉	통과 (1.28ms, 52.3MB)
테스트 6 〉	통과 (1.25ms, 52.3MB)
테스트 7 〉	통과 (1.20ms, 52.7MB)
테스트 8 〉	통과 (1.14ms, 51.7MB)
테스트 9 〉	통과 (1.31ms, 53.2MB)
테스트 10 〉	통과 (1.17ms, 52.8MB)
테스트 11 〉	통과 (1.01ms, 52.9MB)
테스트 12 〉	통과 (1.23ms, 52.8MB)
테스트 13 〉	통과 (1.16ms, 51.9MB)
테스트 14 〉	통과 (0.95ms, 52.5MB)
테스트 15 〉	통과 (1.05ms, 52.7MB)
테스트 16 〉	통과 (0.02ms, 52.9MB)
테스트 17 〉	통과 (1.15ms, 52.8MB)
테스트 18 〉	통과 (1.21ms, 52MB)
테스트 19 〉	통과 (0.03ms, 52.6MB)
테스트 20 〉	통과 (0.03ms, 53.8MB)
테스트 21 〉	통과 (1.74ms, 53.2MB)
테스트 22 〉	통과 (1.36ms, 52MB)
테스트 23 〉	통과 (0.02ms, 51.7MB)
테스트 24 〉	통과 (7.39ms, 54.1MB)
테스트 25 〉	통과 (7.82ms, 52.7MB)
테스트 26 〉	통과 (8.33ms, 53MB)
테스트 27 〉	통과 (10.85ms, 53.4MB)
테스트 28 〉	통과 (1.17ms, 52.4MB)
테스트 29 〉	통과 (1.25ms, 53.1MB)
테스트 30 〉	통과 (1.68ms, 53MB)
테스트 31 〉	통과 (1.64ms, 52.6MB)
테스트 32 〉	통과 (1.19ms, 52.8MB)
효율성  테스트
테스트 1 〉	통과 (261.12ms, 73.8MB)
테스트 2 〉	통과 (75.03ms, 72.6MB)
테스트 3 〉	통과 (215.11ms, 71.6MB)
테스트 4 〉	통과 (198.07ms, 73.6MB)
테스트 5 〉	통과 (272.75ms, 73.8MB)
테스트 6 〉	통과 (252.68ms, 74.2MB)
테스트 7 〉	통과 (288.43ms, 74.4MB)
테스트 8 〉	통과 (305.93ms, 75.5MB)
 */
    public int solution(int[] food_times, long k) {
        long food_count = 0; // 먹을 음식 개수
        int food_time_length = food_times.length;
        for (int i = 0; i < food_time_length; i++) {
            food_count += food_times[i];
        }

        if(food_count <= k) return -1;

        Queue<Food> pq = new PriorityQueue();
        for(int i=0;i<food_time_length;i++){ // 남은 음식 양 순서대로
            pq.offer(new Food(food_times[i], i+1));
        }

        food_count = 0; // 먹기 위해 사용한 시간
        long eat_time = 0; // 직전에 다먹은 음식 시간

        // sum_value
        while(food_count + (pq.peek().time - eat_time) * food_time_length <= k) {
            int now = pq.poll().time;
            food_count += (now - eat_time) * food_time_length;
            food_time_length -= 1;
            eat_time = now;
        }

        ArrayList<Food> list = new ArrayList<>();
        while(!pq.isEmpty()) {
            list.add(pq.poll());
        }

        // 음식의 인덱스 기준으로 정렬
        Collections.sort(list, new Comparator<Food>() {
            @Override
            public int compare(Food a, Food b) {
                return Integer.compare(a.idx, b.idx);
            }
        });

        return list.get((int)((k- food_count) % food_time_length)).idx;
    }

    class Food implements Comparable<Food>{
        private int idx;
        private int time;

        public Food(int time, int idx) {
            this.idx = idx;
            this.time = time;
        }
        public int getIdx() {
            return this.idx;
        }
        public int getTime() {
            return this.time;
        }

        @Override
        public int compareTo(Food o) {
            return this.time - o.time;
        }
    }

/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.5MB)
테스트 2 〉	통과 (0.02ms, 51.7MB)
테스트 3 〉	통과 (0.02ms, 52.6MB)
테스트 4 〉	통과 (0.02ms, 52.7MB)
테스트 5 〉	통과 (0.02ms, 52.1MB)
테스트 6 〉	통과 (0.02ms, 52.5MB)
테스트 7 〉	통과 (0.02ms, 51.6MB)
테스트 8 〉	통과 (0.02ms, 53MB)
테스트 9 〉	통과 (0.03ms, 52.9MB)
테스트 10 〉	통과 (0.03ms, 52.3MB)
테스트 11 〉	통과 (0.04ms, 52.3MB)
테스트 12 〉	통과 (0.03ms, 53.1MB)
테스트 13 〉	통과 (0.03ms, 53.1MB)
테스트 14 〉	통과 (0.03ms, 52.6MB)
테스트 15 〉	통과 (0.03ms, 52MB)
테스트 16 〉	통과 (0.02ms, 51.8MB)
테스트 17 〉	통과 (0.04ms, 52MB)
테스트 18 〉	통과 (0.04ms, 52.1MB)
테스트 19 〉	통과 (0.02ms, 52.9MB)
테스트 20 〉	통과 (0.02ms, 52.7MB)
테스트 21 〉	통과 (0.32ms, 52.4MB)
테스트 22 〉	통과 (0.29ms, 52.8MB)
테스트 23 〉	통과 (0.02ms, 52.7MB)
테스트 24 〉	통과 (1.02ms, 52.4MB)
테스트 25 〉	통과 (0.72ms, 52.3MB)
테스트 26 〉	통과 (2.54ms, 52.3MB)
테스트 27 〉	통과 (6.69ms, 52.1MB)
테스트 28 〉	통과 (0.03ms, 52.6MB)
테스트 29 〉	통과 (0.02ms, 52.8MB)
테스트 30 〉	통과 (0.03ms, 52.5MB)
테스트 31 〉	통과 (0.02ms, 53MB)
테스트 32 〉	통과 (0.03ms, 52.6MB)
효율성  테스트
테스트 1 〉	실패 (3.01ms, 62MB)
테스트 2 〉	실패 (3.08ms, 62MB)
테스트 3 〉	실패 (3.66ms, 61.7MB)
테스트 4 〉	실패 (2.61ms, 62.9MB)
테스트 5 〉	실패 (3.38ms, 63MB)
테스트 6 〉	실패 (3.09ms, 62.1MB)
테스트 7 〉	실패 (3.09ms, 62.8MB)
테스트 8 〉	실패 (3.17ms, 63.3MB)
 */

    public int solution2(int[] food_times, long k) {
        int answer = 0;

        int index=0;
        int length = food_times.length;
        int sum =0;
        for (int food_time : food_times) {
            sum += food_time;
        }

        if(sum<=k){
            return -1;
        }

        while(true){
            for(int i=0;i<length;i++){
                if(food_times[i]!=0) {
                    //4,2,3,6,7,1,5,8
                    food_times[i]--;
                    System.out.println(food_times[i]);
                    index++;
                }

                if(index-1==k){
                    return i+1;
                }
            }

        }

    }
}
