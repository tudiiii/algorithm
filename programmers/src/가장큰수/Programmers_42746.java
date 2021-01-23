package 가장큰수;

import java.util.*;
/*
정확성  테스트
테스트 1 〉	통과 (215.20ms, 80.8MB)
테스트 2 〉	통과 (151.37ms, 74.6MB)
테스트 3 〉	통과 (246.15ms, 82.8MB)
테스트 4 〉	통과 (20.92ms, 54MB)
테스트 5 〉	통과 (188.49ms, 81.3MB)
테스트 6 〉	통과 (179.45ms, 79.3MB)
테스트 7 〉	통과 (2.47ms, 52MB)
테스트 8 〉	통과 (2.47ms, 52.9MB)
테스트 9 〉	통과 (2.36ms, 52MB)
테스트 10 〉	통과 (4.38ms, 52.4MB)
테스트 11 〉	통과 (2.40ms, 52.9MB)
 */
public class Programmers_42746 {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        List<String> strings = new ArrayList<>();

        for(int num : numbers){
            strings.add(String.valueOf(num));
        }

        strings.sort(((o1,o2)->(o2 + o1).compareTo(o1 + o2)));

        for(String s:strings){
            answer.append(s);
        }
        // 0인경우
        return answer.charAt(0) == '0' ? "0" : answer.toString();
    }
}
