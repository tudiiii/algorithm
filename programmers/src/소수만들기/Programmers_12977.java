/*
확성  테스트
테스트 1 〉	통과 (0.75ms, 81.5MB)
테스트 2 〉	통과 (0.72ms, 72MB)
테스트 3 〉	통과 (0.20ms, 72.8MB)
테스트 4 〉	통과 (0.26ms, 74.7MB)
테스트 5 〉	통과 (0.92ms, 83.3MB)
테스트 6 〉	통과 (3.13ms, 78.8MB)
테스트 7 〉	통과 (0.29ms, 75.9MB)
테스트 8 〉	통과 (4.21ms, 75.4MB)
테스트 9 〉	통과 (0.85ms, 78.5MB)
테스트 10 〉	통과 (4.09ms, 84.6MB)
테스트 11 〉	통과 (0.05ms, 75.8MB)
테스트 12 〉	통과 (0.03ms, 71.5MB)
테스트 13 〉	통과 (0.05ms, 76.4MB)
테스트 14 〉	통과 (0.03ms, 75.4MB)
테스트 15 〉	통과 (0.02ms, 73.4MB)
테스트 16 〉	통과 (8.90ms, 70.9MB)
테스트 17 〉	통과 (0.88ms, 75.1MB)
테스트 18 〉	통과 (0.41ms, 76.9MB)
테스트 19 〉	통과 (0.06ms, 81.4MB)
테스트 20 〉	통과 (11.41ms, 77.9MB)
테스트 21 〉	통과 (11.01ms, 67.3MB)
테스트 22 〉	통과 (0.37ms, 70.7MB)
테스트 23 〉	통과 (0.01ms, 74.6MB)
테스트 24 〉	통과 (9.41ms, 73.5MB)
테스트 25 〉	통과 (10.40ms, 73MB)
테스트 26 〉	통과 (0.02ms, 73.8MB)
 */
package 소수만들기;

public class Programmers_12977 {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int n = nums[i] + nums[j] + nums[k];
                    if (isPrime(n)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
