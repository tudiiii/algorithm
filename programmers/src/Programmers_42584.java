/* 주식가격
정확성  테스트
테스트 1 〉	통과 (0.03ms, 52.1MB)
테스트 2 〉	통과 (0.03ms, 53.1MB)
테스트 3 〉	통과 (0.17ms, 52.9MB)
테스트 4 〉	통과 (0.19ms, 53.5MB)
테스트 5 〉	통과 (0.24ms, 53.2MB)
테스트 6 〉	통과 (0.02ms, 52MB)
테스트 7 〉	통과 (0.12ms, 52.3MB)
테스트 8 〉	통과 (0.14ms, 53MB)
테스트 9 〉	통과 (0.02ms, 51.8MB)
테스트 10 〉	통과 (0.26ms, 52.9MB)
효율성  테스트
테스트 1 〉	통과 (10.30ms, 70.9MB)
테스트 2 〉	통과 (12.66ms, 64.3MB)
테스트 3 〉	통과 (11.42ms, 73.9MB)
테스트 4 〉	통과 (14.60ms, 72.2MB)
테스트 5 〉	통과 (9.46ms, 62.6MB)
 */
public class Programmers_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int count = 0; // 시간 count
        int length = prices.length;

        for(int i=0;i<length;i++){
            for (int j = i+1; j <length; j++) {
                count++;
                if (prices[i] > prices[j])  break; // 주식가격이 더 크면 break
            }

            answer[i] = count;
            count = 0;
        }

        return answer;
    }
}
