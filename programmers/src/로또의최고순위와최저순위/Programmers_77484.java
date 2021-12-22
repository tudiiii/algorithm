/*
테스트 1 〉	통과 (0.04ms, 80.1MB)
테스트 2 〉	통과 (0.04ms, 80.8MB)
테스트 3 〉	통과 (0.03ms, 76.1MB)
테스트 4 〉	통과 (0.07ms, 84.1MB)
테스트 5 〉	통과 (0.08ms, 74.7MB)
테스트 6 〉	통과 (0.05ms, 79MB)
테스트 7 〉	통과 (0.06ms, 72.5MB)
테스트 8 〉	통과 (0.06ms, 77.6MB)
테스트 9 〉	통과 (0.08ms, 70.9MB)
테스트 10 〉	통과 (0.08ms, 72.7MB)
테스트 11 〉	통과 (0.06ms, 77.9MB)
테스트 12 〉	통과 (0.05ms, 72.9MB)
테스트 13 〉	통과 (0.07ms, 77MB)
테스트 14 〉	통과 (0.05ms, 80.6MB)
테스트 15 〉	통과 (0.05ms, 74.6MB)
 */
package 로또의최고순위와최저순위;

import java.util.HashMap;
import java.util.Map;

public class Programmers_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {

        int count =0;
        int zeroCount = 0;

        Map<Integer,Integer> myLotto = new HashMap<>();

        int idx=0;
        for(Integer lotto : lottos){

            myLotto.put(idx++,lotto);

            if(lotto==0) zeroCount++;
        }

        for(Integer win : win_nums){
            if(myLotto.containsValue(win)){
                count++;
            }
        }

        if(count==6) return new int[]{1,1};
        if(zeroCount==6) return new int[]{1,6};
        if(count==0&&zeroCount==0) return new int[]{6,6};

        return new int[]{7-zeroCount-count, 7-count };
    }
}
