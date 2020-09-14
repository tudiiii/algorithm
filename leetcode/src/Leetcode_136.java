import java.util.Arrays;
import java.util.LinkedList;

public class Leetcode_136 {
    public int singleNumber(int[] nums) {
        LinkedList<Integer> number = new LinkedList<>();

        Arrays.sort(nums); // 정렬
        for(int num : nums) number.offer(num);

        return sameNumberDelete(number);
    }

    // 같은 값 제거 함
    public int sameNumberDelete(LinkedList<Integer> number){
        int i=0;
        while(number.size()!=0){
            if(number.size()==1){ // 숫자가 하나일 때
                return number.remove(i);
            }

            if(!number.get(i).equals(number.get(i+1))){ // 숫자가 같은게 없으면 바로 값 리턴
                return number.remove(i);
            }

            // 같은 값들 삭제
            number.remove(i);
            // i값이 remove(i)가 되기 전 i++값이 remove(i)한 후 i값이 되므로 i++이 아니라 i를 remove
            number.remove(i);
        }

        return 1;

    }
}
