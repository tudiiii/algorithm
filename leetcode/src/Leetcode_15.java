/* 3sum
Runtime: 482 ms
Memory Usage: 43.4 MB
 */

import java.util.*;

public class Leetcode_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>(); // 리스트 내 리스트 중복 제거

        int sum;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int z=nums.length-1;

            while(z>j){
                sum = nums[i] + nums[j] + nums[z];
                if(sum>0) z--;
                else if(sum<0) j++;
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[z]));
                    z--; j++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
