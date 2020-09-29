/*
테스트 1 〉	통과 (0.67ms, 52.8MB)
테스트 2 〉	통과 (0.76ms, 52.7MB)
테스트 3 〉	통과 (1.50ms, 52.6MB)
테스트 4 〉	통과 (0.75ms, 52.6MB)
테스트 5 〉	통과 (0.87ms, 52.7MB)
테스트 6 〉	통과 (1.91ms, 52.3MB)
테스트 7 〉	통과 (0.60ms, 52.5MB)
테스트 8 〉	통과 (0.52ms, 52.7MB)
테스트 9 〉	통과 (0.47ms, 54.8MB)
테스트 10 〉	통과 (0.51ms, 51.9MB)
테스트 11 〉	통과 (0.92ms, 55.9MB)
테스트 12 〉	통과 (0.42ms, 52.1MB)
테스트 13 〉	통과 (0.88ms, 53.2MB)
테스트 14 〉	통과 (0.82ms, 52.3MB)
테스트 15 〉	통과 (0.72ms, 52.4MB)
테스트 16 〉	통과 (0.38ms, 51.7MB)
 */

import java.util.Arrays;

public class programmers_42747 {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;

        Arrays.sort(citations);
        for (int i = 0; i < length; i++) {
            int k =  length - i;;
            if (k <= citations[i]) {
                answer = k;
                break;
            }
        }
        return answer;
    }
}
