/* 다음 큰 숫자
정확성
테스트 1 〉	통과 (0.04ms, 52.6MB)
테스트 2 〉	통과 (0.04ms, 52MB)
테스트 3 〉	통과 (0.04ms, 52.5MB)
테스트 4 〉	통과 (0.03ms, 53.8MB)
테스트 5 〉	통과 (0.04ms, 51.6MB)
테스트 6 〉	통과 (0.04ms, 52.5MB)
테스트 7 〉	통과 (0.06ms, 52.5MB)
테스트 8 〉	통과 (0.04ms, 52.7MB)
테스트 9 〉	통과 (0.05ms, 52.1MB)
테스트 10 〉	통과 (0.05ms, 52.8MB)
테스트 11 〉	통과 (0.04ms, 53.1MB)
테스트 12 〉	통과 (0.03ms, 52.7MB)
테스트 13 〉	통과 (0.04ms, 52.6MB)
테스트 14 〉	통과 (0.04ms, 52.4MB)

효율성
테스트 1 〉	통과 (0.05ms, 52MB)
테스트 2 〉	통과 (0.04ms, 52MB)
테스트 3 〉	통과 (0.06ms, 52.3MB)
테스트 4 〉	통과 (0.03ms, 52MB)
테스트 5 〉	통과 (0.04ms, 52MB)
테스트 6 〉	통과 (0.04ms, 51.5MB)
 */

public class programmers_12911 {
    public int solution(int n) {
        int answer = iCount(n);

        int count = 1;
        while(true){
            if(answer==iCount(n+count)){
                return n+count;
            }
            count++;
        }
    }

    public int iCount(int number){

        String binaryString = Integer.toBinaryString(number);

        int count = 0;
        int i = 0;

        while(i<binaryString.length()) {
            if('1' == binaryString.charAt(i)) {
                count++;
            }
            i++;
        }

        return count;
    }
}
