import java.util.*;

public class Leetcode_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums); // 정

        HashSet<Integer> numList = new LinkedHashSet<Integer>(); // 중복제
        LinkedList<Integer> element = new LinkedList<>();
        List<Integer> disappearNum = new ArrayList<Integer>(); // 사라진 숫자

        for(int num:nums) numList.add(num); // 중복제거된 값 hash -> LinkedList
        for(int num:numList) element.add(num); // LinkedList -> List

        int i=1;

        while(i<=nums.length){ // nums length만큼 돌면서 사라진 숫자 찾기
            if (element.peek()==null || element.peek() != i) { // 값이 다르거나 null일 경우 숫자가 사라졌다는걸 알 수 있음
                disappearNum.add(i);
            }else{
                element.poll();
            }
            i++;
        }

        return disappearNum;
    }
}
