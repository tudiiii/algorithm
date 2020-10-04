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
            int num = target - nums[i];
            if(answerMap.containsKey(num))
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
            int num = target-nums[i];
            count=0;

            while(count!=nums.length){
                if(num == nums[count] && count!=i){
                    answerList.add(i);
                    answerList.add(count);
                    System.out.println(answerList.size());
                    break;
                }
                count++;
            }

            if(answerList.size()==2) break;
        }

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
