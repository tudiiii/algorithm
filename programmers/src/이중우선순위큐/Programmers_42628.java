package 이중우선순위큐;

import java.util.ArrayDeque;
import java.util.Deque;

public class Programmers_42628 {
    public int[] solution(String[] operations) {
        Deque<Integer> operationDeque = new ArrayDeque<>();

        for(int i=0;i<operations.length;i++){
            String[] operation = operations[i].split(" ");
            if("I".equals(operation[0])){
                operationDeque.add(Integer.valueOf(operation[1]));
            }else{
                if("1".equals(operation[1])){
                    operationDeque.removeFirst();
                }else{
                    operationDeque.removeLast();
                }
            }
        }

        if(operationDeque.isEmpty()){
            return new int[]{0,0};
        }

        return new int[]{operationDeque.removeFirst(),operationDeque.removeLast()};
    }
}
