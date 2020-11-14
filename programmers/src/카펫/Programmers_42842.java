/*
테스트 1 〉	통과 (0.03ms, 54MB)
테스트 2 〉	통과 (0.03ms, 51.7MB)
테스트 3 〉	통과 (0.05ms, 52.6MB)
테스트 4 〉	통과 (0.02ms, 53.6MB)
테스트 5 〉	통과 (0.02ms, 52MB)
테스트 6 〉	통과 (0.03ms, 52.8MB)
테스트 7 〉	통과 (0.05ms, 52.5MB)
테스트 8 〉	통과 (0.03ms, 52.5MB)
테스트 9 〉	통과 (0.05ms, 52.9MB)
테스트 10 〉	통과 (0.04ms, 53.5MB)
테스트 11 〉	통과 (0.03ms, 53.7MB)
테스트 12 〉	통과 (0.01ms, 52.8MB)
테스트 13 〉	통과 (0.03ms, 51.9MB)
 */

package 카펫;

public class Programmers_42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = (brown + 4) / 2; // 가로와 세로의 합
        int width = 3; // 세로
        int depth = sum - width; // 가로

        while(depth >= 3 && depth >= width) { // 조건

            if((depth - 2) * (width - 2) == yellow){
                answer[0] = depth;
                answer[1] = width;
                break;
            }

            depth--; width++;
        }

        return answer;
    }
}
