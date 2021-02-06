package TargetSum;

/*
Runtime: 623 ms
Memory Usage: 38.5 MB
 */
public class Leetcode_494 {
    int count = 0;

    public int findTargetSumWays(int[] nums, int S) {

        checkSymbol(nums, S, 0, 0);
        return count;
    }

    public void checkSymbol(int[] nums, int S , int sum ,int l){
        if (l != nums.length) {
            checkSymbol(nums,S,sum+nums[l],l+1);
            checkSymbol(nums,S,sum-nums[l],l+1);
        } else {
            if(sum == S) count++;
        }
    }
}
