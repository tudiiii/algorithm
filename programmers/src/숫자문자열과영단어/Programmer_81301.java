/*
정확성  테스트
테스트 1 〉	통과 (0.06ms, 77.5MB)
테스트 2 〉	통과 (0.08ms, 75.8MB)
테스트 3 〉	통과 (0.06ms, 75.8MB)
테스트 4 〉	통과 (0.07ms, 76.1MB)
테스트 5 〉	통과 (0.10ms, 71.1MB)
테스트 6 〉	통과 (0.13ms, 83.6MB)
테스트 7 〉	통과 (0.09ms, 77.2MB)
테스트 8 〉	통과 (0.13ms, 78.2MB)
테스트 9 〉	통과 (0.11ms, 72MB)
테스트 10 〉	통과 (0.07ms, 80.3MB)
 */
package 숫자문자열과영단어;

import java.util.HashMap;
import java.util.Map;

public class Programmer_81301 {
    public int solution(String s) {
        Map<Integer, String > wordMap = new HashMap<>();

        wordMap.put(0,"zero");
        wordMap.put(1,"one");
        wordMap.put(2,"two");
        wordMap.put(3,"three");
        wordMap.put(4,"four");
        wordMap.put(5,"five");
        wordMap.put(6,"six");
        wordMap.put(7,"seven");
        wordMap.put(8,"eight");
        wordMap.put(9,"nine");

        for(int i=0;i<10;i++){
            if(s.contains(wordMap.get(i))) {
                s = s.replace(wordMap.get(i),Integer.toString(i));
            }
        }

        return Integer.parseInt(s);
    }
}
