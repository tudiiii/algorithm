package 시소짝꿍;

import java.util.Arrays;

public class Programmers_152996 {

    public long solution(int[] weights) {
        long answer = 0;
        int count = 0;

        Arrays.sort(weights);

        for (int i = 0; i < weights.length; i++) {
            if (i > 0 && weights[i] == weights[i - 1]) {
                count--;
                answer += count;
                continue;
            }

            count = 0;

            for(int j=i+1; j<weights.length; j++){
                if(weights[i]==weights[j] ||
                    weights[i]*4==weights[j]*3 ||
                    weights[i]*3==weights[j]*2 ||
                    weights[i]*2==weights[j] ) {
                    count++;
                }
            }

            answer += count;
        }

        return answer;
    }
}
