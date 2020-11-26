package DailyTemperatures;

import java.util.Stack;

public class Leetcode_739 {
    /*
    Runtime: 13 ms
    Memory Usage: 47.6 MB
     */
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[T.length];
        for(int i = 0; i < T.length; i++) {
            while(!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }
        return answer;
    }

    /*
    Runtime: 1081 ms
    Memory Usage: 47.6 MB
     */
    public int[] dailyTemperatures2(int[] T) {
        int[] answer = new int[T.length];

        int count = 0;
        for(int i=0;i<T.length;i++){
            for(int j=1;j<T.length;j++){
                count ++;
                if(T[i]<T[j]){
                    answer[i] = count;
                    break;
                }
            }
            count = 0;
        }
        return answer;
    }
}
