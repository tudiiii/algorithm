/*
정확성  테스트
테스트 1 〉	통과 (2.49ms, 73.9MB)
테스트 2 〉	통과 (2.43ms, 76.7MB)
테스트 3 〉	통과 (2.83ms, 72.3MB)
테스트 4 〉	통과 (2.25ms, 70.8MB)
테스트 5 〉	통과 (5.53ms, 78.8MB)
테스트 6 〉	통과 (5.40ms, 79.8MB)
테스트 7 〉	통과 (7.27ms, 99.5MB)
테스트 8 〉	통과 (6.35ms, 85.5MB)
테스트 9 〉	통과 (7.13ms, 77.8MB)
테스트 10 〉	통과 (6.24ms, 80.4MB)
테스트 11 〉	통과 (5.56ms, 77.9MB)
테스트 12 〉	통과 (5.12ms, 79.4MB)
테스트 13 〉	통과 (6.13ms, 73.3MB)
테스트 14 〉	통과 (6.72ms, 90.4MB)
테스트 15 〉	통과 (2.15ms, 76.9MB)
테스트 16 〉	통과 (2.20ms, 75.1MB)
테스트 17 〉	통과 (3.05ms, 72.3MB)
테스트 18 〉	통과 (2.87ms, 75.6MB)
테스트 19 〉	통과 (7.73ms, 82.2MB)
테스트 20 〉	통과 (5.88ms, 89.3MB)
테스트 21 〉	통과 (6.27ms, 75.9MB)
테스트 22 〉	통과 (5.14ms, 79.5MB)
테스트 23 〉	통과 (5.70ms, 76.5MB)
테스트 24 〉	통과 (6.66ms, 79.1MB)
테스트 25 〉	통과 (106.01ms, 197MB)
테스트 26 〉	통과 (104.25ms, 186MB)
테스트 27 〉	통과 (107.99ms, 185MB)
테스트 28 〉	통과 (94.80ms, 180MB)
테스트 29 〉	통과 (153.45ms, 193MB)
테스트 30 〉	통과 (121.71ms, 186MB)
테스트 31 〉	통과 (153.49ms, 209MB)
테스트 32 〉	통과 (105.89ms, 195MB)
 */
package 오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers_42888 {
    public String[] solution(String[] record) {
        Map<String, String> user = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for(String info : record){
            String[] split = info.split(" ");

            if (split[0].equals("Leave")) {
                continue;
            }
            user.put(split[1], split[2]);
        }

        for (String info : record) {
            String[] split = info.split(" ");
            String command = split[0];
            String userId = split[1];
            String nickname = user.get(userId);

            switch (command) {
                case "Change":
                    break;
                case "Enter":
                    answer.add(nickname + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    answer.add(nickname + "님이 나갔습니다.");
                    break;
            }
        }

        return answer.toArray(new String[0]);
    }
}
