import java.util.*;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result=0;
        int len=d.length;

        Arrays.sort(d);

        for(int i=0;i<len;i++){
            result+=d[i];
            if(result<=budget){
                answer++;
            }
        }

        return answer;
    }
}