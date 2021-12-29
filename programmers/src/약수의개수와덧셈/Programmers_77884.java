/*
정확성  테스트
테스트 1 〉	통과 (3.40ms, 77.1MB)
테스트 2 〉	통과 (1.20ms, 77.2MB)
테스트 3 〉	통과 (1.34ms, 76.2MB)
테스트 4 〉	통과 (0.90ms, 78.3MB)
테스트 5 〉	통과 (3.10ms, 85.7MB)
테스트 6 〉	통과 (0.38ms, 74.2MB)
테스트 7 〉	통과 (0.16ms, 81.8MB)
 */
package 약수의개수와덧셈;

public class Programmers_77884 {
    public int solution(int left, int right) {
        int sum =0;

        for(int i=left;i<=right;i++){

            int answer=0;

            for(int j=1;j<=i;j++){
                if(i%j==0){
                    answer++;
                }
            }

            if(answer%2==0){
                sum +=i;
            }else {
                sum -=i;
            }

        }
        return sum;
    }

}
