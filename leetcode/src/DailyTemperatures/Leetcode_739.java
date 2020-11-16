/*
Runtime: 1081 ms
Memory Usage: 47.6 MB
 */

package DailyTemperatures;

public class Leetcode_739 {
    public int[] dailyTemperatures(int[] T) {
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
