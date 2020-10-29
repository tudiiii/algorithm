/*
    테스트 1 〉	통과 (0.03ms, 70.1MB)
    테스트 2 〉	통과 (0.08ms, 69.3MB)
    테스트 3 〉	통과 (0.06ms, 68.5MB)
    테스트 4 〉	통과 (0.06ms, 69.2MB)
    테스트 5 〉	통과 (0.06ms, 68.5MB)
    테스트 6 〉	통과 (0.03ms, 69.5MB)`
    테스트 7 〉	통과 (0.06ms, 69.1MB)
    테스트 8 〉	통과 (0.07ms, 68.6MB)
    테스트 9 〉	통과 (0.05ms, 68.4MB)
    테스트 10 〉	통과 (0.09ms, 68.8MB)
    테스트 11 〉	통과 (0.05ms, 68.8MB)
    테스트 12 〉	통과 (0.04ms, 68MB)
 */

package 체육복;

import java.util.ArrayList;
import java.util.List;

public class programmers_42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전체학생 수 - 체육복 잃어버린 학생 수
        int answer = n - lost.length;

        List<Integer> lostStudent = new ArrayList<>();
        List<Integer> reserveStudent = new ArrayList<>();

        // 여분이 있는데 체육복을 잃어버린 학생 0
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j] && lost[i]!=0){
                    lost[i] = 0;
                    reserve[j] = 0;
                    answer++;
                }
            }
        }

        // 체육복 분실했지만 여분이 있는 학생 제외하고 LIST에 추가
        for(int lo : lost)  if(lo!=0) lostStudent.add(lo);
        for(int re : reserve)   if(re!=0)   reserveStudent.add(re);

        // 체육복 여분이 있는 학생이 없으면 END
        if(reserveStudent.size()==0) return answer;

        int i=0; int j=0; // 이중 for문 처럼 List 돌리기 (기준 -> 체육복 없는 학생)
        while(!lostStudent.isEmpty()){
            // 체육복 여유분을 나눠줄 수 있을 때
            if(lostStudent.get(i)==(reserveStudent.get(j)+1) || lostStudent.get(i)==(reserveStudent.get(j)-1)){
                // 수업에 참여할 수 있는 학생들은 제외
                lostStudent.remove(i);
                reserveStudent.remove(j);
                j=0; // 비교가 끝났기 때문에 j초기화 (이중for 문 느낌)
                answer++; // 수업에 참여할 수 있는 학생 수 ++
            }else{
                j++; 
                // 체육복을 빌릴수가 없을때
                if(j==reserveStudent.size()){
                    // 수업 참여 못 하는 학생 제외
                    lostStudent.remove(i);
                    j=0;
                }
            }

            if(reserveStudent.isEmpty()){
                break;
            }
        }


        // 체육복 여분이 있는 학생이 없으면 END
        return answer;
    }


/*
테스트 1 〉	통과 (0.86ms, 50.5MB)
테스트 2 〉	통과 (0.91ms, 52.2MB)
테스트 3 〉	통과 (0.90ms, 50.1MB)
테스트 4 〉	통과 (0.89ms, 52.3MB)
테스트 5 〉	통과 (0.85ms, 52.7MB)
테스트 6 〉	통과 (0.91ms, 52.8MB)
테스트 7 〉	실패 (1.99ms, 50.1MB)
테스트 8 〉	통과 (0.96ms, 52.7MB)
테스트 9 〉	통과 (0.87ms, 50.6MB)
테스트 10 〉	통과 (1.05ms, 52.6MB)
테스트 11 〉	통과 (0.90ms, 52.8MB)
테스트 12 〉	통과 (0.85ms, 50.4MB)
 */
    //  옛날코드
    public int solution2(int n, int[] lost, int[] reserve) {
        int answer=n - lost.length; // 체육복 가지고 있는 학생 수

        List<Integer> lostList = new ArrayList<>();
        // 체육복을 잃어버린 학생의 리스트
        for(int num: lost){
            lostList.add(num);
        }

        List<Integer> reserveList = new ArrayList<>();
        // 체육복 여분을 가지고 있는 학생의 리스트
        for(int num: reserve){
            reserveList.add(num);
        }

        // 체육복의 잃어버렸지만 여분을 갖고 있는 학생
        for(int i=0;i<lostList.size();i++){
            for(int j=0;j<reserveList.size();j++){
                if (lostList.get(i) == reserveList.get(j)) {
                    lostList.remove(i);
                    reserveList.remove(j);
                    answer++;
                    break;
                }
            }
        }

        // 잃어버린 학생의 앞 뒤 학생이 체육복을 빌려줌
        for(int i=0;i<lostList.size();i++){
            int lostListNum = lostList.get(i);
            for(int j=0;j<reserveList.size();j++){
                int reserveListNum = reserveList.get(j);
                if(lostListNum==reserveListNum-1||lostListNum==reserveListNum+1){
                    reserveList.remove(j);
                    answer++;
                    break;
                }

            }
        }

        return answer;
    }
}
