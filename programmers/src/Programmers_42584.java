/* 주식가격
정확성  테스트
테스트 1 〉	통과 (0.02ms, 52.6MB)
테스트 2 〉	통과 (0.03ms, 52.4MB)
테스트 3 〉	통과 (0.18ms, 53.1MB)
테스트 4 〉	통과 (0.20ms, 53MB)
테스트 5 〉	통과 (0.17ms, 54.4MB)
테스트 6 〉	통과 (0.03ms, 52.7MB)
테스트 7 〉	통과 (0.12ms, 52.3MB)
테스트 8 〉	통과 (0.15ms, 53.1MB)
테스트 9 〉	통과 (0.02ms, 52.4MB)
테스트 10 〉	통과 (0.25ms, 52.7MB)
효율성  테스트
테스트 1 〉	통과 (14.28ms, 71MB)
테스트 2 〉	통과 (13.70ms, 66.5MB)
테스트 3 〉	통과 (13.67ms, 75.1MB)
테스트 4 〉	통과 (14.01ms, 71.5MB)
테스트 5 〉	통과 (9.47ms, 64.4MB)
 */
public class Programmers_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int count = 0; // 시간 count

        for(int i=0;i<prices.length;i++){
            for (int j = i+1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j])  break; // 주식가격이 더 크면 break
            }

            answer[i] = count;
            count = 0;
        }

        return answer;
    }
}
