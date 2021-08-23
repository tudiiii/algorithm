package 부족한금액계산하기;

/* 위클리 챌린지 1주차
테스트 1 〉	통과 (0.02ms, 77.2MB)
테스트 2 〉	통과 (0.02ms, 71.9MB)
테스트 3 〉	통과 (0.03ms, 60.5MB)
테스트 4 〉	통과 (0.01ms, 74.2MB)
테스트 5 〉	통과 (0.02ms, 57.5MB)
테스트 6 〉	통과 (0.02ms, 72.6MB)
테스트 7 〉	통과 (0.04ms, 59.7MB)
테스트 8 〉	통과 (0.03ms, 75MB)
테스트 9 〉	통과 (0.02ms, 60.1MB)
테스트 10 〉	통과 (0.03ms, 70.9MB)
테스트 11 〉	통과 (0.03ms, 60.3MB)
테스트 12 〉	통과 (0.04ms, 67MB)
테스트 13 〉	통과 (0.03ms, 58.5MB)
테스트 14 〉	통과 (0.03ms, 72.5MB)
테스트 15 〉	통과 (0.04ms, 76.3MB)
테스트 16 〉	통과 (0.03ms, 61.2MB)
테스트 17 〉	통과 (0.04ms, 68.4MB)
테스트 18 〉	통과 (0.06ms, 69MB)
테스트 19 〉	통과 (0.06ms, 71.3MB)
테스트 20 〉	통과 (0.06ms, 59.1MB)
테스트 21 〉	통과 (0.06ms, 74.9MB)
테스트 22 〉	통과 (0.06ms, 60.3MB)
테스트 23 〉	통과 (0.03ms, 58.1MB)
 */
public class Programmers_82612 {
    public long solution(int price, int money, int count) {
        long result = money;

        for(int i=1;i<=count;i++){
            result -=  price * i;
        }

        return result <0 ? -result : 0;
    }
}
