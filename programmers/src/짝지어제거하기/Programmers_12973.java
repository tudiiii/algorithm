package 짝지어제거하기;
/*
정확성  테스트
테스트 1 〉	통과 (0.19ms, 78MB)
테스트 2 〉	통과 (9.98ms, 74.9MB)
테스트 3 〉	통과 (12.04ms, 78MB)
테스트 4 〉	통과 (11.32ms, 76.8MB)
테스트 5 〉	통과 (12.60ms, 77.8MB)
테스트 6 〉	통과 (12.52ms, 81.6MB)
테스트 7 〉	통과 (11.55ms, 79.7MB)
테스트 8 〉	통과 (12.52ms, 87.8MB)
테스트 9 〉	통과 (0.19ms, 75.4MB)
테스트 10 〉	통과 (0.30ms, 67.4MB)
테스트 11 〉	통과 (0.20ms, 78.2MB)
테스트 12 〉	통과 (0.21ms, 84.5MB)
테스트 13 〉	통과 (0.19ms, 73.3MB)
효율성  테스트
테스트 1 〉	통과 (70.70ms, 63.5MB)
테스트 2 〉	통과 (47.63ms, 57.6MB)
테스트 3 〉	통과 (58.49ms, 60.8MB)
테스트 4 〉	통과 (60.12ms, 60.6MB)
테스트 5 〉	통과 (53.82ms, 61.7MB)
테스트 6 〉	통과 (56.89ms, 61.2MB)
테스트 7 〉	통과 (60.41ms, 60.7MB)
테스트 8 〉	통과 (58.13ms, 60.7MB)
 */

import java.util.Stack;

public class Programmers_12973 {

    public int solution(String s)
    {
        if (s.length() == 0) {
            return 1;
        }

        Stack<Character> word = new Stack<>();
        char[] charTmp = s.toCharArray();

        for (char c : charTmp) {
            if (word.empty()) {
                word.push(c);
                continue;
            }

            if (word.peek() != c) {
                word.push(c);
            } else {
                word.pop();
            }
        }

        return word.size()==0 ? 1 : 0;
    }
}
