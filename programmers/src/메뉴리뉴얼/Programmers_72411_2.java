package 메뉴리뉴얼;
/*
정확성  테스트
테스트 1 〉	통과 (2.98ms, 74.4MB)
테스트 2 〉	통과 (2.57ms, 74.7MB)
테스트 3 〉	통과 (2.58ms, 85.1MB)
테스트 4 〉	통과 (2.68ms, 75.1MB)
테스트 5 〉	통과 (3.41ms, 75MB)
테스트 6 〉	통과 (5.93ms, 77.5MB)
테스트 7 〉	통과 (6.09ms, 67.5MB)
테스트 8 〉	통과 (16.34ms, 90.4MB)
테스트 9 〉	통과 (16.79ms, 92.8MB)
테스트 10 〉	통과 (9.97ms, 80MB)
테스트 11 〉	통과 (10.66ms, 86.9MB)
테스트 12 〉	통과 (12.15ms, 85.4MB)
테스트 13 〉	통과 (17.02ms, 80.9MB)
테스트 14 〉	통과 (12.13ms, 78.5MB)
테스트 15 〉	통과 (12.54ms, 85.3MB)
테스트 16 〉	통과 (7.12ms, 79.6MB)
테스트 17 〉	통과 (9.36ms, 80.9MB)
테스트 18 〉	통과 (8.73ms, 81.9MB)
테스트 19 〉	통과 (5.83ms, 82MB)
테스트 20 〉	통과 (9.94ms, 79MB)
 */
import java.util.*;

public class Programmers_72411_2 {

    static Map<String , Integer> map;
    static int max;

    public String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        map = new HashMap<>();

        for (String order : orders) {
            String[] one = order.split("");
            Arrays.sort(one);

            max = 0;

            for (int j = 0; j < one.length - 1; j++) {
                for (int value : course) {
                    dfs(one, j, 1, value, one[j]);
                }
            }
        }

        for(Integer cou : course){
            for (String menu : map.keySet()) {
                if (map.get(menu)>1 && menu.length() == cou) {
                    max = Math.max(max,map.get(menu));
                }
            }

            for (String menu : map.keySet()) {
                if(max==map.get(menu)&& menu.length()==cou){
                    pq.offer(menu);
                }
            }

            max=0;
        }

        String[] answer = new String[pq.size()];
        int idx=0;
        while (!pq.isEmpty()){
            answer[idx++] = pq.poll();
        }

        return answer;
    }

    static void dfs(String[] one, int idx, int len, int courseLen, String str) {
        if(len == courseLen) {
            map.put(str, map.getOrDefault(str, 0)+1);
        }

        for(int i= idx+1; i<one.length; i++) {
            dfs(one, i, len+1, courseLen, str+one[i]);
        }
    }
}
