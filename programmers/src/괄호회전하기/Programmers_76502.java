package 괄호회전하기;
/*
정확성  테스트
테스트 1 〉	통과 (41.50ms, 113MB)
테스트 2 〉	통과 (34.26ms, 105MB)
테스트 3 〉	통과 (23.48ms, 107MB)
테스트 4 〉	통과 (20.16ms, 106MB)
테스트 5 〉	통과 (38.37ms, 113MB)
테스트 6 〉	통과 (22.10ms, 100MB)
테스트 7 〉	통과 (22.83ms, 109MB)
테스트 8 〉	통과 (23.66ms, 98.4MB)
테스트 9 〉	통과 (28.90ms, 101MB)
테스트 10 〉	통과 (48.54ms, 122MB)
테스트 11 〉	통과 (39.46ms, 100MB)
테스트 12 〉	통과 (0.02ms, 74.4MB)
테스트 13 〉	통과 (0.02ms, 70.7MB)
테스트 14 〉	통과 (1.11ms, 78.7MB)
 */
import java.util.Stack;
public class Programmers_76502 {
    public int solution(String s) {
        int answer = 0;

        if(s.length()%2!=0) return 0;

        for (int i = 0; i < s.length(); i++) {
            if (isValid(s)) {
                answer++;
            }
            s = String.format("%s%s", s.substring(1), s.charAt(0));
        }

        return answer;
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            switch (c) {
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ']':
                    if(stack.isEmpty()||stack.peek()!='[') return false;
                    stack.pop(); break;
                case '}':
                    if(stack.isEmpty()||stack.peek()!='{') return false;
                    stack.pop(); break;
                case ')':
                    if(stack.isEmpty()||stack.peek()!='(') return false;
                    stack.pop(); break;
            }

        }
        return stack.isEmpty();
    }

}
