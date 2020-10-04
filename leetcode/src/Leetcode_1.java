import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_1 {

    /*
    Runtime: 1 ms
    Memory Usage: 39 MB
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> answerMap = new HashMap<>();

        for(int i=0;i<nums.length;i++) 	{
            int num = target - nums[i]; // target이 되기 위해 필요한 수
            if(answerMap.containsKey(num))
                // num의 인덱스, num과 합하면 taget이 되는 수의 인덱스
                return new int[] {i, answerMap.get(num)};
            answerMap.put(nums[i], i);
        }

        return new int []{-1,-1};
    }

    /*
        Runtime: 129 ms
        Memory Usage: 39.5 MB
     */
    public int[] twoSum2(int[] nums, int target) {

        List<Integer> answerList = new ArrayList<>();
        int count;

        for(int i=0;i<nums.length;i++){
            int num = target-nums[i]; // target이 되기 위해 필요한 수
            count=0;

            while(count!=nums.length){
                if(num == nums[count] && count!=i){
                    // 합해서 target이 되는 수의 인덱스
                    answerList.add(i);
                    answerList.add(count);
                    break;
                }
                count++;
            }

            if(answerList.size()==2) break; // answerList에 필요한 값이 있으면 break
        }

        // List -> array
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
