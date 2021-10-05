package 직업군추천하기;

import java.util.*;
/*
정확성  테스트
테스트 1 〉	통과 (0.16ms, 70.4MB)
테스트 2 〉	통과 (0.17ms, 72.5MB)
테스트 3 〉	통과 (0.16ms, 78MB)
테스트 4 〉	통과 (0.17ms, 69.8MB)
테스트 5 〉	통과 (0.12ms, 71.6MB)
테스트 6 〉	통과 (0.13ms, 76.8MB)
테스트 7 〉	통과 (0.13ms, 78MB)
테스트 8 〉	통과 (0.10ms, 73.1MB)
테스트 9 〉	통과 (0.10ms, 66.5MB)
테스트 10 〉	통과 (0.11ms, 75.5MB)
 */

public class Programmers_84325 {
    public String solution(String[] table, String[] languages, int[] preference) {

        String answer = "";
        int max =0;

        for (String s : table) {
            String[] lang = s.split(" ");
            String job = lang[0];

            Map<String, Integer> map = new HashMap<>();

            for (int score = 5; score >= 1; score--) {
                map.put(lang[5 - score + 1], score);
            }

            int sum = 0;

            for (int j = 0; j < languages.length; j++) {
                if (map.containsKey(languages[j])) {
                    sum += map.get(languages[j]) * preference[j];
                }
            }

            if (max < sum) {
                max = sum;
                answer = job;
            } else if (max == sum && answer.compareTo(job) > 0) {
                answer = job;
            }
        }

        return answer;
    }
}

/*
* compareTo()
: 문자열의 사전순 값을 비교하여 그에 해당되는 int 값을 리턴한다.

* A.compareTo(B)
    - A = A  =  0 (동일한 경우)
    - A > B  =  1 (좌측 값이 큰 경우)
    - A < B  = -1 (좌측 값이 작은 경우)
 */
