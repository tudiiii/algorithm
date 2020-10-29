/*
    테스트 1 〉	통과 (0.07ms, 53.1MB)
    테스트 2 〉	통과 (0.06ms, 51.9MB)
    테스트 3 〉	통과 (0.05ms, 52MB)
    테스트 4 〉	통과 (0.05ms, 52.4MB)
    테스트 5 〉	통과 (0.06ms, 53MB)
    테스트 6 〉	통과 (0.07ms, 52.4MB)
    테스트 7 〉	통과 (0.43ms, 52.9MB)
    테스트 8 〉	통과 (0.25ms, 52.3MB)
    테스트 9 〉	통과 (0.98ms, 53.4MB)
    테스트 10 〉	통과 (0.47ms, 52.4MB)
    테스트 11 〉	통과 (0.95ms, 53.1MB)
    테스트 12 〉	통과 (0.90ms, 53.5MB)
    테스트 13 〉	통과 (0.11ms, 53.9MB)
    테스트 14 〉	통과 (1.07ms, 53.6MB)
 */

package 모의고사;

import java.util.ArrayList;
import java.util.List;

public class programmers_42840 {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c =  {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0,0,0};

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%a.length]) {score[0]++;}
            if(answers[i] == b[i%b.length]) {score[1]++;}
            if(answers[i] == c[i%c.length]) {score[2]++;}
        }

        int maxScore = Math.max(score[0],Math.max(score[1],score[2]));

        List<Integer> list = new ArrayList<>();
        if(maxScore==score[0]) {list.add(1);}
        if(maxScore==score[1]) {list.add(2);}
        if(maxScore==score[2]) {list.add(3);}

        int[] answer = new int[list.size()];

        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
