package 약수의개수와덧셈;
/*
정확성  테스트
테스트 1 〉	통과 (0.11ms, 76.9MB)
테스트 2 〉	통과 (0.08ms, 85.2MB)
테스트 3 〉	통과 (0.04ms, 79.1MB)
테스트 4 〉	통과 (0.05ms, 72MB)
테스트 5 〉	통과 (0.09ms, 74.6MB)
테스트 6 〉	통과 (0.02ms, 72.2MB)
테스트 7 〉	통과 (0.08ms, 75.4MB)
 */
public class Programmers_77884_2 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left;i<=right;i++){

            // 제곱수인 경우 약수의 개수가 홀수
            if(i%Math.sqrt(i)==0){
                answer -= i;
            }else {
                answer += i;
            }
        }

        return answer;
    }
}
