package TopKFrequentElements;

import java.util.*;

/*
Runtime: 11 ms
Memory Usage: 41.3 MB
 */
public class Leetcode_347 {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer = new int[k];
        Map<Integer, Integer> numMap = new HashMap();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> numList = new ArrayList<>(numMap.keySet());
        numList.sort((o2, o1) -> (numMap.get(o1).compareTo(numMap.get(o2))));

        for(int i=0;i<k;i++){
            answer[i] = numList.get(i);
        }
        //answer = IntStream.range(0, k).map(numList::get).toArray();

        return answer;
    }
}
