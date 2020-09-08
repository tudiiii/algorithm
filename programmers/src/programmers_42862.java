/* 체육복
테스트 1 〉	통과 (0.03ms, 70.1MB)
테스트 2 〉	통과 (0.08ms, 69.3MB)
테스트 3 〉	통과 (0.06ms, 68.5MB)
테스트 4 〉	통과 (0.06ms, 69.2MB)
테스트 5 〉	통과 (0.06ms, 68.5MB)
테스트 6 〉	통과 (0.03ms, 69.5MB)
테스트 7 〉	통과 (0.06ms, 69.1MB)
테스트 8 〉	통과 (0.07ms, 68.6MB)
테스트 9 〉	통과 (0.05ms, 68.4MB)
테스트 10 〉	통과 (0.09ms, 68.8MB)
테스트 11 〉	통과 (0.05ms, 68.8MB)
테스트 12 〉	통과 (0.04ms, 68MB)
 */

import java.util.ArrayList;
import java.util.List;

public class programmers_42862 {

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        List<Integer> lostStudent = new ArrayList<>();
        List<Integer> reserveStudent = new ArrayList<>();

        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j] && lost[i]!=0){
                    lost[i] = 0;
                    reserve[j] = 0;
                    answer++;
                }
            }
        }

        for(int lo : lost)  if(lo!=0) lostStudent.add(lo);
        for(int re : reserve)   if(re!=0)   reserveStudent.add(re);

        if(reserveStudent.size()==0) return answer;

        int i=0; int j=0;
        while(!lostStudent.isEmpty()){
            if(lostStudent.get(i)==(reserveStudent.get(j)+1) || lostStudent.get(i)==(reserveStudent.get(j)-1)){
                lostStudent.remove(i);
                reserveStudent.remove(j);
                j=0; // 비교가 끝났기 때문에 j초기화 (이중for문 느낌)
                answer++;
            }else{
                j++;
                if(j==reserveStudent.size()){
                    lostStudent.remove(i);
                    j=0;
                }
            }

            if(reserveStudent.isEmpty()){
                break;
            }
        }


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
