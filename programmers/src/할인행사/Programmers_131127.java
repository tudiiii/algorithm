package 할인행사;

import java.util.HashMap;

public class Programmers_131127 {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> wantMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int j = 0; j <= discount.length - 10; j++) {
            HashMap<String, Integer> tmpMap = new HashMap<>();
            for (int i = j; i < j+10; i++) {
                tmpMap.put(discount[i], tmpMap.getOrDefault(discount[i], 0) + 1);
            }

            if (checkMap(wantMap, tmpMap)) {
                count++;
            }
        }

        return count;
    }

    private boolean checkMap(HashMap<String, Integer> a, HashMap<String, Integer> b) {
        return a.equals(b);
    }
}
