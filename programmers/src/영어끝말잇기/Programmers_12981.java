/*
## 영어 끝말잇
테스트 1 〉	통과 (0.04ms, 76.8MB)
테스트 2 〉	통과 (0.06ms, 77.7MB)
테스트 3 〉	통과 (0.03ms, 72MB)
테스트 4 〉	통과 (0.04ms, 66.5MB)
테스트 5 〉	통과 (0.13ms, 81.8MB)
테스트 6 〉	통과 (0.05ms, 82.8MB)
테스트 7 〉	통과 (0.07ms, 80.3MB)
테스트 8 〉	통과 (0.05ms, 75.5MB)
테스트 9 〉	통과 (0.05ms, 73.8MB)
테스트 10 〉	통과 (0.15ms, 83.6MB)
테스트 11 〉	통과 (0.08ms, 79MB)
테스트 12 〉	통과 (0.05ms, 73.1MB)
테스트 13 〉	통과 (0.03ms, 76.3MB)
테스트 14 〉	통과 (0.03ms, 72.2MB)
테스트 15 〉	통과 (0.03ms, 74.2MB)
테스트 16 〉	통과 (0.05ms, 75.8MB)
테스트 17 〉	통과 (0.03ms, 75.6MB)
테스트 18 〉	통과 (0.07ms, 74.8MB)
테스트 19 〉	통과 (0.03ms, 79.9MB)
테스트 20 〉	통과 (0.23ms, 71.7MB)
 */
package 영어끝말잇기;

import java.util.ArrayList;
import java.util.List;

public class Programmers_12981 {
    public int[] solution(int n, String[] words) {
        List<String> wordList = new ArrayList<>();

        int person = 0;
        int game = 1;

        for (int i = 0; i < words.length; i++) {
            person++;

            if (i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
                || wordList.contains(words[i])) {
                return new int[]{person, game};
            }

            wordList.add(words[i]);

            if (n == person) {
                game++;
                person = 0;
            }
        }

        return new int[]{0, 0};
    }
}
