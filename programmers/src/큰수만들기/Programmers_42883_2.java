/*
정확성  테스트
테스트 1 〉	통과 (0.27ms, 67.4MB)
테스트 2 〉	통과 (0.36ms, 82.4MB)
테스트 3 〉	통과 (0.36ms, 76.1MB)
테스트 4 〉	통과 (1.26ms, 82.6MB)
테스트 5 〉	통과 (1.41ms, 75.3MB)
테스트 6 〉	통과 (8.28ms, 94.2MB)
테스트 7 〉	통과 (15.33ms, 78.1MB)
테스트 8 〉	통과 (27.30ms, 93.2MB)
테스트 9 〉	통과 (37.56ms, 98.2MB)
테스트 10 〉	통과 (68.51ms, 91.2MB)
테스트 11 〉	통과 (0.28ms, 83.9MB)
테스트 12 〉	통과 (0.23ms, 80.8MB)
 */
package 큰수만들기;

import java.util.Stack;

public class Programmers_42883_2 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = number.toCharArray();
        char[] result = new char[number.length()-k];
        int deleteCnt = 0;

        for(int i=0;i<number.length();i++) {
            while (!stack.isEmpty() && charArray[i] > stack.peek() && k!=deleteCnt){
                stack.pop();
                deleteCnt++;
            }

            stack.push(charArray[i]);
        }

        for(int i=0;i<result.length;i++){
            result[i] = stack.get(i);
        }

        return new String(result);
    }
}
