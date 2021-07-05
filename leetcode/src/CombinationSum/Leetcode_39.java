package CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(candidates);
        getResult(list, new ArrayList<>(), candidates, target, 0);

        return list;
    }

    public void getResult(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int target, int start){
        if(target > 0){
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                tempList.add(candidates[i]);
                getResult(result, tempList, candidates, target - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
        else if(target == 0 ){
            result.add(new ArrayList<Integer>(tempList));
        }
    }
}
