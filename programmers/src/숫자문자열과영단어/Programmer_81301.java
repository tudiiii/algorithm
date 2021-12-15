/*
정확성  테스트
테스트 1 〉	통과 (0.08ms, 74.3MB)
테스트 2 〉	통과 (0.07ms, 83.5MB)
테스트 3 〉	통과 (0.09ms, 88.3MB)
테스트 4 〉	통과 (0.05ms, 74.6MB)
테스트 5 〉	통과 (0.06ms, 73.6MB)
테스트 6 〉	통과 (0.10ms, 73MB)
테스트 7 〉	통과 (0.07ms, 75.6MB)
테스트 8 〉	통과 (0.06ms, 82.9MB)
테스트 9 〉	통과 (0.14ms, 74.1MB)
테스트 10 〉	통과 (0.06ms, 78.1MB)
 */
package 숫자문자열과영단어;

public class Programmer_81301 {
    public int solution(String s) {

        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0;i<10;i++){
            s = s.replace(word[i],Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}
