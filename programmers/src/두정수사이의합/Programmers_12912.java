/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 73.2MB)
테스트 2 〉	통과 (0.02ms, 73.1MB)
테스트 3 〉	통과 (0.04ms, 80MB)
테스트 4 〉	통과 (12.41ms, 73.9MB)
테스트 5 〉	통과 (14.46ms, 76MB)
테스트 6 〉	통과 (8.42ms, 78.9MB)
테스트 7 〉	통과 (5.82ms, 73.4MB)
테스트 8 〉	통과 (13.10ms, 73.4MB)
테스트 9 〉	통과 (6.56ms, 78.8MB)
테스트 10 〉	통과 (5.49ms, 79.5MB)
테스트 11 〉	통과 (0.29ms, 74.2MB)
테스트 12 〉	통과 (0.61ms, 77.4MB)
테스트 13 〉	통과 (0.24ms, 74.3MB)
테스트 14 〉	통과 (0.03ms, 79.3MB)
테스트 15 〉	통과 (0.06ms, 85.6MB)
테스트 16 〉	통과 (0.17ms, 76.3MB)
 */
package 두정수사이의합;

public class Programmers_12912 {
    public long solution(int a, int b) {
        long answer = 0;

        for(int i = (Math.min(a, b)); i<=(Math.max(a, b)); i++){
            answer += i;
        }

        return answer;
    }
}
