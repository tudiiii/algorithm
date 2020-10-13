/* 3sum
Runtime: 28 ms
Memory Usage: 43.4 MB
 */

import java.util.*;

public class Leetcode_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length<3) return new ArrayList<>(); // 배열이 3보다 작을 때 return []
        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>(); // 리스트 내 리스트 중복 제거

        for(int i=0;i<nums.length-2;i++){ // 전체 인덱스 크기보다 1 작아야함 == 배열 길이보다 -2
            // nums[i] 을 기준으로 잡고 양 옆의 숫자법(left,right)를 줄여가면서 더해보는 방법
            // nums가 -4  -1 -1 0 1 2 일때
            // -4를 기준으로 left -1 , right 2의 인덱스 대입

            if(i!= 0 && nums[i-1] == nums[i]) continue; // 기준 값과 다음 값이 같으면 continue => 메모이제이션
            int left = i+1;
            int right=nums.length-1;

            while(left<right){ // right의 인덱스가 작아지면 break
                int sum = nums[i] + nums[left] + nums[right];
                // sum이 0이면 result 값 삽입
                // sum>0 이면 right인덱스 --,  sum<0 이면 left 인덱스 ++
                if(sum>0) right--;
                else if(sum<0) left++;
                else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    right--; left++;
                }
            }
        }

        return new ArrayList<>(result); // Set -> List
    }
}
