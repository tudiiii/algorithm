package 나라의숫자124;
/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 52.5MB)
테스트 2 〉	통과 (0.05ms, 53MB)
테스트 3 〉	통과 (0.04ms, 52.5MB)
테스트 4 〉	통과 (0.04ms, 52.8MB)
테스트 5 〉	통과 (0.04ms, 52.6MB)
테스트 6 〉	통과 (0.05ms, 54.2MB)
테스트 7 〉	통과 (0.06ms, 52.3MB)
테스트 8 〉	통과 (0.04ms, 52.6MB)
테스트 9 〉	통과 (0.06ms, 54.4MB)
테스트 10 〉	통과 (0.04ms, 51.9MB)
테스트 11 〉	통과 (0.05ms, 52.4MB)
테스트 12 〉	통과 (0.05ms, 52.4MB)
테스트 13 〉	통과 (0.05ms, 51.8MB)
테스트 14 〉	통과 (0.06ms, 52.3MB)
효율성  테스트
테스트 1 〉	통과 (0.04ms, 53.8MB)
테스트 2 〉	통과 (0.05ms, 51.9MB)
테스트 3 〉	통과 (0.05ms, 53MB)
테스트 4 〉	통과 (0.05ms, 52.2MB)
테스트 5 〉	통과 (0.07ms, 52.1MB)
테스트 6 〉	통과 (0.08ms, 52.1MB)
 */
public class Programmers_12899 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        String [] numbers = {"4","1","2"};

        while(n>0){
            int num = n%3;
            answer.insert(0, numbers[num]);

            n = n/3 ;
            if(num == 0){
                n = n - 1;
            }
        }

        return answer.toString();
    }
}
