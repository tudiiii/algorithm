import java.util.*;

public class Leetcode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        HashSet<Integer> numList = new LinkedHashSet<Integer>();
        LinkedList<Integer> element = new LinkedList<>();
        List<Integer> out = new ArrayList<Integer>();

        for(int num:nums) numList.add(num);
        for(int num:numList) element.add(num);

        int i=1;
        while(!element.isEmpty()){
            System.out.println(element.peek());
            if(element.peek()==i){
                element.poll();
            }else {
                out.add(element.poll());
            }
            i++;
        }

        return out;
    }
}
