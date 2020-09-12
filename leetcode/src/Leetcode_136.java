import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_136 {
    public int singleNumber(int[] nums) {
        LinkedList<Integer> number = new LinkedList<>();

        for(int num:nums) number.offer(num);

        int numFlag = number.remove(0);
        int i=0;

        while(number.size()!=0){
            if(numFlag == number.get(i)){
                number.remove(i);
                numFlag =  number.poll();
                i=0;
            }else{
                i++;
            }

            if(i==number.size()){
                break;
            }
        }

        return numFlag;
    }
}
