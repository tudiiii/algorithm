package 삼진법뒤집기;
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 76.5MB)
테스트 2 〉	통과 (0.05ms, 71.1MB)
테스트 3 〉	통과 (0.05ms, 74.2MB)
테스트 4 〉	통과 (0.04ms, 72.3MB)
테스트 5 〉	통과 (0.08ms, 70.1MB)
테스트 6 〉	통과 (0.06ms, 75.5MB)
테스트 7 〉	통과 (0.05ms, 75.2MB)
테스트 8 〉	통과 (0.05ms, 78.3MB)
테스트 9 〉	통과 (0.05ms, 71.8MB)
테스트 10 〉	통과 (0.10ms, 66.9MB)
 */
public class Programmers_62048 {
    public int solution(int n) {

        String binary3 = Integer.toString(n, 3);
        String reversBinary = new StringBuilder(binary3).reverse().toString();

        return Integer.parseInt(reversBinary,3);
    }
}
