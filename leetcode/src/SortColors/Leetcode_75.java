package SortColors;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_75 {
    /*
    Runtime: 0 ms
    Memory Usage: 37.6 MB
     */
    public void sortColors(int[] nums) {

        List<Integer> answerList = new ArrayList<>();

        for(int j=0;j<3;j++){
            for (int num : nums) { // 0,1,2 같은 값이 있을 경우 갯수만 세서 리스트에 저
                if (num == j) answerList.add(j);
            }
        }

        for(int i=0;i<answerList.size();i++){
            nums[i] = answerList.get(i);
        }

    }
}
