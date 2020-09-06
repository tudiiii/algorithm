/*
기능개발

테스트 1 〉	통과 (0.44ms, 71.9MB)
테스트 2 〉	통과 (0.77ms, 69.3MB)
테스트 3 〉	통과 (0.69ms, 69.8MB)
테스트 4 〉	통과 (0.52ms, 70.3MB)
테스트 5 〉	통과 (1.73ms, 69.9MB)
테스트 6 〉	통과 (0.45ms, 69.3MB)
테스트 7 〉	통과 (0.65ms, 68.6MB)
테스트 8 〉	통과 (1.14ms, 69.5MB)
테스트 9 〉	통과 (0.58ms, 69.9MB)
테스트 10 〉	통과 (0.58ms, 70.5MB)
테스트 11 〉	통과 (0.41ms, 68.6MB)
 */

import java.util.LinkedList;
import java.util.Queue;

public class programmers_42568 {
    public int[] solution(int[] progresses, int[] speeds) {
        int i=0;
        Queue<Integer> pro = new LinkedList<Integer>();
        LinkedList<Integer> days = new LinkedList<Integer>();
        LinkedList<Integer> result = new LinkedList<Integer>();

        // 데이터 삽입
        for(int progress : progresses){
            pro.add(progress);
            i++;
        }

        // 작업날짜 구하기
        while(!pro.isEmpty()){
          days.add(dayCount(pro.poll(),speeds[i]));
          i++;
        }

        int count= 1;
        int day = days.poll();

        while(!days.isEmpty()){
            if(days.peek()>day){
                day = days.poll();
                result.offer(count);
                count=1;
            }

            days.poll();
            count++;

            if(days.size()==0){
                result.offer(count);
            }
        }

        int[] answer =new int[result.size()];

        for(i=0;i<answer.length;i++){
            answer[i] = result.poll();
        }

        return answer;
    }
    
    // 배포 가능한 날짜 구하기
    public int dayCount(int process, int speed){
        return (int) Math.ceil((double)(100-process)/speed);
    }


}
