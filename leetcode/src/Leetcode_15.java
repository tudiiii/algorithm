import java.util.*;

public class Leetcode_15 {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length<3) return new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for(int num:nums) numList.add(num);
        Collections.sort(numList); // 리스트 정렬

        while(!numList.isEmpty()){
            int standard = numList.remove(0);
            System.out.println("standard====" + standard);

            for(int i=0;i<numList.size()-1;i++){
                int nextNum = numList.get(i);
                System.out.println("nextNum====" + nextNum);
                for(int j=i+1;j<numList.size();j++){
                    if(-numList.get(j) == (standard+nextNum)){
                        List<Integer> small = new ArrayList<>();
                        small.add(standard);
                        small.add(nextNum);
                        small.add(numList.get(j));
                        result.add(small);

                    }
                }
            }
        }

        for(int i=0;i<result.size()-1;i++){
            if(result.get(i).equals(result.get(i+1))) result.remove(i);
        }
        return result;
    }
}
