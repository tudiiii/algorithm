import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        List<Integer> answerList = new ArrayList<>();

        Queue<Integer> priceQueue = new LinkedList<>();

        for(int price : prices) priceQueue.add(price);

        int count;
        int index = 1;
        while(!priceQueue.isEmpty()){
            count = 0;
            for(int i=index;i<prices.length;i++){
                System.out.println(priceQueue.peek() + ", " + prices[i]);
                if(priceQueue.peek()<prices[i]) {
                    count++;
                }
            }
            priceQueue.poll();

            answerList.add(count);
            System.out.println(answerList);
            index++;
        }

        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
