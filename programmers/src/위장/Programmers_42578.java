package 위장;

import java.util.HashMap;
import java.util.Set;

public class Programmers_42578 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesHash = new HashMap<String, Integer>();

        for(int i =0; i<clothes.length; i++){
            clothesHash.put(clothes[i][1], clothesHash.getOrDefault(clothes[i][1], 0)+1);
        }

        Set<String> keySet = clothesHash.keySet();

        for(String key : keySet) {
            answer *= clothesHash.get(key)+1;
        }

        return answer-1;

    }
}
