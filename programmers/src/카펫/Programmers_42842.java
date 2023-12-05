/*
테스트 1 〉	통과 (0.01ms, 71.2MB)
테스트 2 〉	통과 (0.03ms, 75.8MB)
테스트 3 〉	통과 (0.08ms, 77.3MB)
테스트 4 〉	통과 (0.02ms, 75.3MB)
테스트 5 〉	통과 (0.02ms, 77.4MB)
테스트 6 〉	통과 (0.03ms, 78.4MB)
테스트 7 〉	통과 (0.06ms, 72.5MB)
테스트 8 〉	통과 (0.07ms, 74.9MB)
테스트 9 〉	통과 (0.07ms, 73.1MB)
테스트 10 〉	통과 (0.09ms, 77.2MB)
테스트 11 〉	통과 (0.01ms, 77.1MB)
테스트 12 〉	통과 (0.02ms, 78.3MB)
테스트 13 〉	통과 (0.02ms, 77.5MB)
 */

package 카펫;

public class Programmers_42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 3; i < brown + yellow; i++) {
            int width = (brown + yellow) / i;
            boolean isPrime = (brown + yellow) % i == 0;
            if (isPrime && width >= i) {
                int yellowTmp = (width - 2) * (i - 2);

                if (yellowTmp == yellow) {
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }
}
