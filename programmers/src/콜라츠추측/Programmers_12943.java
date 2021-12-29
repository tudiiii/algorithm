/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 77.8MB)
테스트 2 〉	통과 (0.03ms, 76MB)
테스트 3 〉	통과 (0.02ms, 79.5MB)
테스트 4 〉	통과 (0.04ms, 73.2MB)
테스트 5 〉	통과 (0.05ms, 77MB)
테스트 6 〉	통과 (0.03ms, 69.9MB)
테스트 7 〉	통과 (0.04ms, 77.3MB)
테스트 8 〉	통과 (0.02ms, 78.7MB)
테스트 9 〉	통과 (0.02ms, 73.5MB)
테스트 10 〉	통과 (0.06ms, 73.2MB)
테스트 11 〉	통과 (0.04ms, 65.8MB)
테스트 12 〉	통과 (0.02ms, 74.1MB)
테스트 13 〉	통과 (0.02ms, 73.7MB)
테스트 14 〉	통과 (0.03ms, 87.5MB)
테스트 15 〉	통과 (0.04ms, 77.8MB)
테스트 16 〉	통과 (0.04ms, 79.4MB)
 */
package 콜라츠추측;

public class Programmers_12943 {
    public int solution(int num) {
        int answer = 0;
        long number = num;

        while(number > 1) {

            if(answer==500) {
                answer = -1;
                break;
            }

            number = number % 2 == 0 ? number / 2 : number * 3 + 1;

            answer++;
        }

        return answer;
    }
}
