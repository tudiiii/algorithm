/*
기능개발

테스트 1 〉	통과 (0.41ms, 69.7MB)
테스트 2 〉	통과 (0.71ms, 69.6MB)
테스트 3 〉	통과 (0.65ms, 69.1MB)
테스트 4 〉	통과 (0.51ms, 69.7MB)
테스트 5 〉	통과 (0.43ms, 68.9MB)
테스트 6 〉	통과 (0.50ms, 69.1MB)
테스트 7 〉	통과 (0.60ms, 70.3MB)
테스트 8 〉	통과 (0.45ms, 68.5MB)
테스트 9 〉	통과 (0.58ms, 68.8MB)
테스트 10 〉	통과 (0.74ms, 70.7MB)
테스트 11 〉	통과 (0.46ms, 70.8MB)
 */

import java.util.LinkedList;
import java.util.Queue;

public class programmers_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> pro = new LinkedList<>();
        LinkedList<Integer> list;

        // 데이터 삽입
        for(int progress : progresses){
            pro.add(progress);
        }

        // 개발속도에 따른 기능배포 갯수 리스트
        list = functionNum(deploy(pro,speeds));

        // linkedList -> int[]
        return LinkedListToInt(list);
    }

    // 배포까지 걸리는 작업일수 리스트
    public LinkedList<Integer> deploy (Queue<Integer> pro, int[] speeds){

        LinkedList<Integer> days = new LinkedList<>();
        int i=0;

        while(!pro.isEmpty()){
            days.add(dayCount(pro.poll(),speeds[i]));
            i++;
        }

        return days;
    }

    // 배포가능 작업일수 구하기
    public int dayCount(int process, int speed){
        return (int) Math.ceil((double)(100-process)/speed);
    }

    // 리스트에 한 번에 배포될 수 있는 기능갯수 추가
    public LinkedList<Integer> functionNum(Queue<Integer> days){

        LinkedList<Integer> result = new LinkedList<>();
        int count= 1;
        int day = days.remove();

        while(!days.isEmpty()){
            if(days.peek()>day){ // 배포
                day = days.poll();
                result.offer(count);

                count=1;
            }else{ // 배포같이할 일 찾기
                days.poll();
                count++;
            }

            if(days.size()==0){
                result.offer(count);
            }
        }
        return result;
    }

    // 기능배포 갯수 리턴
    public int[] LinkedListToInt(LinkedList<Integer> result ){

        int[] answer =new int[result.size()];

        for(int i=0;i<answer.length;i++){
            answer[i] = result.remove();
        }
        return answer;
    }
}
