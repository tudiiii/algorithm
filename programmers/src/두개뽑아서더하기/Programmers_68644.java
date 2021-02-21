package 두개뽑아서더하기;

/*
정확성  테스트
테스트 1 〉	통과 (0.50ms, 52.2MB)
테스트 2 〉	통과 (0.50ms, 52.4MB)
테스트 3 〉	통과 (0.54ms, 52.4MB)
테스트 4 〉	통과 (0.49ms, 53.3MB)
테스트 5 〉	통과 (0.62ms, 52.5MB)
테스트 6 〉	통과 (1.37ms, 52.4MB)
테스트 7 〉	통과 (9.60ms, 52.4MB)
테스트 8 〉	통과 (3.73ms, 52.5MB)
테스트 9 〉	통과 (1.51ms, 52.5MB)
 */

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class Programmers_68644 {
    public int[] solution(int[] numbers) {

        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int c = numbers[i] + numbers[j];
                if(answerList.indexOf(c) < 0) // !answerList.contains(c)
                    answerList.add(c);
            }
        }

        int[] answer = new int[answerList.size()];

        for(int i = 0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        sort(answer);
        return answer;
    }

}
