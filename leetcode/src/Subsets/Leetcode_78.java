package Subsets;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_78 {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>());

        for(int n : nums){
            int size =  list.size();

            for(int i=0;i<size;i++){
                List<Integer> tmp = new ArrayList<>(list.get(i));
                tmp.add(n);
                list.add(tmp);
            }
        }

        return list;
    }
}
