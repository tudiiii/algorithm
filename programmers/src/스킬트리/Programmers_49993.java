/*
    테스트 1 〉	통과 (0.16ms, 53.1MB)
    테스트 2 〉	통과 (0.19ms, 53MB)
    테스트 3 〉	통과 (0.19ms, 52.7MB)
    테스트 4 〉	통과 (0.23ms, 52.7MB)
    테스트 5 〉	통과 (0.25ms, 52.4MB)
    테스트 6 〉	통과 (0.15ms, 52.4MB)
    테스트 7 〉	통과 (0.23ms, 52.6MB)
    테스트 8 〉	통과 (0.19ms, 52.1MB)
    테스트 9 〉	통과 (0.24ms, 54.2MB)
    테스트 10 〉	통과 (0.15ms, 53.2MB)
    테스트 11 〉	통과 (0.25ms, 52.7MB)
    테스트 12 〉	통과 (0.17ms, 51.8MB)
    테스트 13 〉	통과 (0.27ms, 52.6MB)
    테스트 14 〉	통과 (0.25ms, 52.4MB)
 */

package 스킬트리;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Programmers_49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        Map<Character,Integer> skillMap = new HashMap<>();

        for(int i=0;i<skill.length();i++){
            skillMap.put(skill.charAt(i),i); // (스킬, 스킬트리순서)
        }

        for(String skill_tree : skill_trees){
            Map<Character,Integer> treeMap = new LinkedHashMap<>();
            int count =0; // 스킬 통과 개수
            int zero = 0; // 스킬(skillMap)에 없어서 바로 통과할 수 있는 스킬 개
            int skillTreeLength = skill_tree.length();

            for(int j=0;j<skillTreeLength;j++){
                char skillChar = skill_tree.charAt(j);

                if(skillMap.containsKey(skillChar)){ // skill에 포함된 값이면 스킬트리 순서 값 대입
                    treeMap.put(skillChar, skillMap.get(skillChar));
                    if(skillMap.get(skillChar)<=count) { // 스킬트리 순서값보다 작으면 다음 스킬을 배울 수 있음
                        count++;
                    }else{
                        break;
                    }
                }else{ // skill에 포함되지 않은 값은 모두 0번째 순서
                    treeMap.put(skillChar, 0);
                    zero++; // 스킬트리 순서값이 0이므로 다음 스킬을 배울 수 있음
                }
            }
            // 스킬 길이만큼 스킬을 배울 수 있으면 스킬트리 통과!
            if(count+zero==skillTreeLength) answer++;
        }
        return answer;

    }
}
