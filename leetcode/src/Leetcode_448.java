/*
Run time : 31 ms
Memory Usage: 47.7 MB
 */
import java.util.*;

public class Leetcode_448 {
    /*
        두번째 푼 방법
        Run time : 17 ms
        Memory Usage: 47.6 MB
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>(); // 중복제거, 정렬
        List<Integer> disappearNum = new ArrayList<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int i = 1; i<= nums.length; i++) {
            if(!set.contains(i)) // num 값을 포함하고 있지 않으면 사라진 숫자이기 때문에
                disappearNum.add(i); // disappeareNum에 add();
        }

        return disappearNum;
    }

     /*
        첫번 푼 방법
        Run time : 31 ms
        Memory Usage: 47.7 MB
    */
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        Arrays.sort(nums); // 정렬

        HashSet<Integer> numList = new LinkedHashSet<>(); // 중복제
        LinkedList<Integer> element = new LinkedList<>();
        List<Integer> disappearNum = new ArrayList<>(); // 사라진 숫자

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
