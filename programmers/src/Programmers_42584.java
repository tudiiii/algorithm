import java.util.Stack;

public class Programmers_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> priceStack = new Stack<>();

        for(int price : prices) priceStack.push(price);

        for(int i=0;i<prices.length;i++){
            int priceTop = priceStack.pop();
            int count = 0;
            while(priceTop>priceStack.peek()){
                count++;
            }
            answer[prices.length-1] = count;
        }


        return answer;
    }
}
