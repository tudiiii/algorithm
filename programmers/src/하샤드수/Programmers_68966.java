/* 하샤드 수
테스트 1 〉	통과 (0.02ms, 52.1MB)
테스트 2 〉	통과 (0.03ms, 52.4MB)
테스트 3 〉	통과 (0.02ms, 52.2MB)
테스트 4 〉	통과 (0.03ms, 53.6MB)
테스트 5 〉	통과 (0.03ms, 52.7MB)
테스트 6 〉	통과 (0.02ms, 53.1MB)
테스트 7 〉	통과 (0.02ms, 52.2MB)
테스트 8 〉	통과 (0.02ms, 51.7MB)
테스트 9 〉	통과 (0.02ms, 52.9MB)
테스트 10 〉	통과 (0.02ms, 52.3MB)
테스트 11 〉	통과 (0.02ms, 51.7MB)
테스트 12 〉	통과 (0.02ms, 52.6MB)
테스트 13 〉	통과 (0.02ms, 54MB)
테스트 14 〉	통과 (0.02ms, 52MB)
테스트 15 〉	통과 (0.02ms, 52.4MB)
테스트 16 〉	통과 (0.02ms, 52.8MB)
테스트 17 〉	통과 (0.02ms, 53MB)
 */

package 하샤드수;

public class Programmers_68966 {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;

        while(x!=0){
            sum += x % 10;
            x = x/10;
        }

        return num % sum == 0;
    }
}
