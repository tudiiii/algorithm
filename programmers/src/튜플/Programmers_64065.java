package 튜플;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programmers_64065 {
    public int[] solution(String s) {
        s = s.replaceAll("[\\{,\\}]", " ");
        String[] number = s.split("[ ]+");

        Map<String, Integer> map = new HashMap<>();
        for (String num : number) {
            if (num.length() != 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> tuple = new ArrayList<>(map.entrySet());
        Collections.sort(tuple, (o1, o2) -> {return o2.getValue().compareTo(o1.getValue());});

        int[] answer = new int[tuple.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Integer.parseInt(tuple.get(i).getKey());
        }

        return answer;
    }
}
