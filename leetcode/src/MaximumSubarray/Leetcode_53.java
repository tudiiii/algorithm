package MaximumSubarray;

// kadane algorithm
public class Leetcode_53 {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int tmpSum = nums[0];

        for(int i=1;i<nums.length;i++){
            tmpSum = Math.max(tmpSum+nums[i], nums[i]);
            maxSum = Math.max(maxSum, tmpSum);
        }

        return maxSum;
    }
}
