/*
테스트 1 〉	통과 (0.27ms, 53.1MB)
테스트 2 〉	통과 (0.36ms, 53.9MB)
테스트 3 〉	통과 (0.43ms, 52MB)
테스트 4 〉	통과 (1.31ms, 52MB)
테스트 5 〉	통과 (1.88ms, 52.5MB)
테스트 6 〉	통과 (9.23ms, 52.6MB)
테스트 7 〉	통과 (27.42ms, 53.8MB)
테스트 8 〉	통과 (30.94ms, 55.8MB)
테스트 9 〉	통과 (49.42ms, 61.1MB)
테스트 10 〉	통과 (95.25ms, 62.6MB)
테스트 11 〉	통과 (0.29ms, 52.8MB)
테스트 12 〉	통과 (0.29ms, 52.4MB)
 */

package 큰수만들기;

import java.util.Stack;

public class Programmers_42883 {
    public String solution(String number, int k) {

        Stack<Character> stack = new Stack<>(); // 스택
        char[] nums = number.toCharArray(); // number 를 하나씩 쪼개서 char
        char[] answer = new char[number.length() - k];

        int deleteCnt = 0;
        int i=0;

        while(i!=nums.length){
            // 스택안의 값이 작으면 pop
            while(!stack.isEmpty() && stack.peek()<nums[i] && deleteCnt != k) {
                stack.pop();
                deleteCnt++;
            }

            stack.push(nums[i]);

            i++;
        }

        for (i=0; i<answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return new String(answer);

    }
}
