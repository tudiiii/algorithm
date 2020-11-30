package ContainerWithMostWater;

public class Leetcode_11 {
    /*
    Runtime: 2 ms
    Memory Usage: 40.4 MB
     */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int max = ((right-left) * Math.min(height[left], height[right]));

        while(left<right){ // 인덱스 비교
            if(height[left]<=height[right]){
                left++;
            }else {
                right--;
            }
            // 최대 넓이 구하기
            max = Math.max(max,((right-left) * Math.min(height[left], height[right])));

        }

        return max;
    }
}
