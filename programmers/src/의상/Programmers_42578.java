package 의상;

import java.util.HashMap;
import java.util.Map;

public class Programmers_42578 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] clothe : clothes) {
            String temps = clothe[1];
            map.put(temps, map.getOrDefault(temps, 1) + 1);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        return answer-1;
    }
}
