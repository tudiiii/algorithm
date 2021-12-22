/*
테스트 1 〉	통과 (0.01ms, 75.5MB)
테스트 2 〉	통과 (0.02ms, 67.7MB)
테스트 3 〉	통과 (0.02ms, 77.8MB)
테스트 4 〉	통과 (0.02ms, 74.9MB)
테스트 5 〉	통과 (0.02ms, 69.7MB)
테스트 6 〉	통과 (0.03ms, 75.9MB)
테스트 7 〉	통과 (0.02ms, 78.1MB)
테스트 8 〉	통과 (0.02ms, 72MB)
테스트 9 〉	통과 (0.02ms, 77.4MB)
 */
package 없는숫자더하기;

public class Programmers_86051 {
    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] numHasflag = new boolean[10];

        for(Integer num : numbers){
            numHasflag[num] = true;
        }

        for(int i=0;i<10;i++){
            if(!numHasflag[i]){
                answer += i;
            }
        }

        return answer;
    }
}
