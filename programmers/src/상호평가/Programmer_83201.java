package 상호평가;

/* 위클리 챌린지 2주
    테스트 1 〉	통과 (0.03ms, 58.2MB)
    테스트 2 〉	통과 (0.04ms, 69.5MB)
    테스트 3 〉	통과 (0.03ms, 58.9MB)
    테스트 4 〉	통과 (0.03ms, 58.3MB)
    테스트 5 〉	통과 (0.04ms, 59.3MB)
    테스트 6 〉	통과 (0.04ms, 60.6MB)
    테스트 7 〉	통과 (0.03ms, 58.4MB)
    테스트 8 〉	통과 (0.04ms, 70.4MB)
    테스트 9 〉	통과 (0.04ms, 58.4MB)
    테스트 10 〉	통과 (0.04ms, 72.4MB)
    테스트 11 〉	통과 (0.04ms, 59MB)
    테스트 12 〉	통과 (0.03ms, 69.1MB)
    테스트 13 〉	통과 (0.03ms, 67.5MB)
    테스트 14 〉	통과 (0.05ms, 72.8MB)
    테스트 15 〉	통과 (0.03ms, 58MB)
    테스트 16 〉	통과 (0.03ms, 72MB)
    테스트 17 〉	통과 (0.06ms, 69.9MB)
    테스트 18 〉	통과 (0.04ms, 74.6MB)
    테스트 19 〉	통과 (0.05ms, 71.3MB)
    테스트 20 〉	통과 (0.05ms, 72.3MB)
    테스트 21 〉	통과 (0.03ms, 73.2MB)
 */

public class Programmer_83201 {
    public String solution(int[][] scores) {

        long tmp;
        int length = scores.length;
        long[] sum = new long[length];
        boolean[] isMax = new boolean[length];

        // 최대인지 확인 후 최대면 true
        for(int i=0;i<length;i++){
            isMax[i] = true;

            tmp = scores[i][i];
            for(int j=1;j<length;j++){
                if (tmp < scores[j][i]) {
                    isMax[i] = false;
                    break;
                }
            }
        }

        // 최소인지 확인 후 최소면 true
        for(int i=0;i<length;i++){
            if(!isMax[i]){
                isMax[i]=true;

              for(int j=0;j<length;j++){
                  tmp = scores[i][i];
                  if(tmp>scores[j][i]&&i!=j){
                      isMax[i] = false;
                  }
              }
          }
        }

        // 같은지 확인 후 같으면 true
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if (isMax[i] && i != j && scores[i][i] == scores[j][i]) {
                    isMax[i] = false;
                    break;
                }
            }
        }

        // true 일 경우, 자기 자신을 빼기
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores.length;j++){
                if(isMax[i]&&i==j){
                    sum[i] -= scores[i][i];
                }
                sum[i] += scores[j][i];
            }
        }

        // true 일 경우, 자기 자신 제외하고 평균을 구함
        for(int i=0;i<length;i++){
            if(isMax[i]){
                sum[i] = sum[i]/(length-1);
            }else{
                sum[i] = sum[i]/length;
            }
        }

        StringBuilder result = new StringBuilder();

        for (long l : sum) {
            result.append(l >= 90 ? "A" : l >= 80 ? "B" : l >= 70 ? "C" : l >= 50 ? "D" : "F");
        }

        return result.toString();
    }

}
