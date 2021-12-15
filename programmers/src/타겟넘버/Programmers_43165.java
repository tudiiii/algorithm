/*
정확성  테스트
테스트 1 〉	통과 (4.30ms, 74.4MB)
테스트 2 〉	통과 (4.16ms, 78.1MB)
테스트 3 〉	통과 (0.18ms, 74.1MB)
테스트 4 〉	통과 (0.35ms, 75.5MB)
테스트 5 〉	통과 (0.53ms, 75.5MB)
테스트 6 〉	통과 (0.31ms, 74.8MB)
테스트 7 〉	통과 (0.24ms, 84.2MB)
테스트 8 〉	통과 (0.44ms, 78.3MB)
 */
package 타겟넘버;

public class Programmers_43165 {
    int count =0;

    public int solution(int[] numbers, int target) {
        sumDfs(numbers, numbers[0],0,target);
        sumDfs(numbers,-1 *numbers[0],0,target);
        return count;
    }

    public void sumDfs(int[] number, int result, int depth, int target){
        if(depth==number.length-1){
            if(target==result){
                count++;
            }
            return;
        }

        sumDfs(number, result+number[depth+1],depth+1,target);
        sumDfs(number, result-number[depth+1],depth+1,target);
    }
}
