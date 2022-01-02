/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 72.6MB)
테스트 2 〉	통과 (0.02ms, 77.3MB)
테스트 3 〉	통과 (0.03ms, 78.8MB)
테스트 4 〉	통과 (0.04ms, 80.7MB)
테스트 5 〉	통과 (0.04ms, 71.8MB)
테스트 6 〉	통과 (0.04ms, 84.9MB)
테스트 7 〉	통과 (0.03ms, 77.8MB)
테스트 8 〉	통과 (0.02ms, 71.5MB)
테스트 9 〉	통과 (0.03ms, 76.6MB)
테스트 10 〉	통과 (0.07ms, 76.5MB)
테스트 11 〉	통과 (0.07ms, 75.7MB)
테스트 12 〉	통과 (0.11ms, 83.3MB)
테스트 13 〉	통과 (0.14ms, 83MB)
테스트 14 〉	통과 (0.27ms, 76MB)
테스트 15 〉	통과 (0.49ms, 79.5MB)
테스트 16 〉	통과 (0.81ms, 80.5MB)
테스트 17 〉	통과 (1.23ms, 87.1MB)
테스트 18 〉	통과 (1.08ms, 88.2MB)
테스트 19 〉	통과 (1.32ms, 86.7MB)
테스트 20 〉	통과 (1.57ms, 84.9MB)
 */
package 최소직사각형;

public class Programmers_86491 {
    public int solution(int[][] sizes) {
        int maxNum =0;
        int minNum = 0;

        for (int[] size : sizes) {
            maxNum = Math.max(Math.max(size[0], size[1]), maxNum);
            minNum = Math.max(Math.min(size[0], size[1]), minNum);
        }

        return maxNum * minNum ;
    }
}
