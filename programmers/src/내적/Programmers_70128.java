package 내적;
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 75.9MB)
테스트 2 〉	통과 (0.03ms, 72.8MB)
테스트 3 〉	통과 (0.03ms, 75.2MB)
테스트 4 〉	통과 (0.02ms, 75.6MB)
테스트 5 〉	통과 (0.02ms, 74.9MB)
테스트 6 〉	통과 (0.02ms, 66.9MB)
테스트 7 〉	통과 (0.04ms, 73.7MB)
테스트 8 〉	통과 (0.04ms, 76.4MB)
테스트 9 〉	통과 (0.04ms, 78MB)

 */
public class Programmers_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0;i<a.length;i++){
            answer += a[i] * b[i];
        }

        return answer;
    }
}
