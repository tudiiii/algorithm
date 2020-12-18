package 정수삼각형;

/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 53MB)
테스트 2 〉	통과 (0.04ms, 52.2MB)
테스트 3 〉	통과 (0.04ms, 52.8MB)
테스트 4 〉	통과 (0.07ms, 53.2MB)
테스트 5 〉	통과 (0.26ms, 52.3MB)
테스트 6 〉	통과 (0.10ms, 53.1MB)
테스트 7 〉	통과 (0.27ms, 52.6MB)
테스트 8 〉	통과 (0.09ms, 52.5MB)
테스트 9 〉	통과 (0.03ms, 52.7MB)
테스트 10 〉	통과 (0.06ms, 51.9MB)
효율성  테스트
테스트 1 〉	통과 (7.94ms, 61.2MB)
테스트 2 〉	통과 (5.68ms, 58.4MB)
테스트 3 〉	통과 (6.46ms, 61MB)
테스트 4 〉	통과 (6.20ms, 59.6MB)
테스트 5 〉	통과 (7.41ms, 59.9MB)
테스트 6 〉	통과 (6.66ms, 61.1MB)
테스트 7 〉	통과 (7.89ms, 60.6MB)
테스트 8 〉	통과 (9.70ms, 59.7MB)
테스트 9 〉	통과 (8.87ms, 57.9MB)
테스트 10 〉	통과 (7.66ms, 63.8MB)
 */
public class Programmers_43105 {
    public int solution(int[][] triangle) {

        int length = triangle.length;

        for(int i=length-2 ; i>=0 ; i--){  // 아래부터 더하기
            for(int j=0 ; j<=i ; j++) {
                triangle[i][j] += Math.max(triangle[i+1][j],triangle[i+1][j+1]);
            }
        }

        return triangle[0][0];
    }
}
