package 나라의숫자124;
/*
정확성  테스트
테스트 1 〉	통과 (1.74ms, 53.2MB)
테스트 2 〉	통과 (2.26ms, 53MB)
테스트 3 〉	통과 (1.63ms, 52.7MB)
테스트 4 〉	통과 (1.84ms, 51.7MB)
테스트 5 〉	통과 (1.38ms, 52.3MB)
테스트 6 〉	통과 (1.55ms, 51.8MB)
테스트 7 〉	통과 (1.63ms, 52.7MB)
테스트 8 〉	통과 (1.57ms, 51.6MB)
테스트 9 〉	통과 (1.62ms, 52.2MB)
테스트 10 〉	통과 (1.63ms, 52.4MB)
테스트 11 〉	통과 (1.67ms, 53.2MB)
테스트 12 〉	통과 (1.64ms, 53.3MB)
테스트 13 〉	통과 (1.57ms, 52.1MB)
테스트 14 〉	통과 (1.61ms, 51.9MB)
효율성  테스트
테스트 1 〉	통과 (1.71ms, 52.8MB)
테스트 2 〉	통과 (1.45ms, 52.8MB)
테스트 3 〉	통과 (1.89ms, 52.8MB)
테스트 4 〉	통과 (1.33ms, 52MB)
테스트 5 〉	통과 (1.30ms, 52.5MB)
테스트 6 〉	통과 (1.62ms, 52.3MB)
 */
public class Programmers_12899 {
    public String solution(int n) {
        String answer = "";

        String [] numbers = {"4","1","2"};

        while(n>0){
            int num = n%3;
            answer = numbers[num] + answer;

            n = n/3 ;
            if(num==0){
                n = n -1;
            }
        }

        return answer;
    }
}
