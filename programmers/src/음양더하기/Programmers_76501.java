package 음양더하기;

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 79.3MB)
테스트 2 〉	통과 (0.05ms, 77.4MB)
테스트 3 〉	통과 (0.04ms, 78.7MB)
테스트 4 〉	통과 (0.04ms, 69.6MB)
테스트 5 〉	통과 (0.05ms, 71.8MB)
테스트 6 〉	통과 (0.04ms, 79.1MB)
테스트 7 〉	통과 (0.04ms, 78.7MB)
테스트 8 〉	통과 (0.08ms, 69.2MB)
테스트 9 〉	통과 (0.06ms, 76.3MB)
 */

public class Programmers_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0;i<absolutes.length;i++){
            answer+= absolutes[i] * (signs[i] ? 1 : -1);
        }

        return answer;
    }
}
