package K진수에서소수개수구하기;
/*
정확성  테스트
테스트 1 〉	통과 (12.23ms, 79.1MB)
테스트 2 〉	통과 (0.14ms, 73MB)
테스트 3 〉	통과 (0.17ms, 73.6MB)
테스트 4 〉	통과 (0.18ms, 76.2MB)
테스트 5 〉	통과 (0.18ms, 73.9MB)
테스트 6 〉	통과 (0.21ms, 75.3MB)
테스트 7 〉	통과 (0.25ms, 80.6MB)
테스트 8 〉	통과 (0.21ms, 74MB)
테스트 9 〉	통과 (0.16ms, 81MB)
테스트 10 〉	통과 (0.18ms, 71.9MB)
테스트 11 〉	통과 (0.15ms, 76.4MB)
테스트 12 〉	통과 (0.24ms, 73.5MB)
테스트 13 〉	통과 (0.19ms, 72.1MB)
테스트 14 〉	통과 (0.11ms, 75.9MB)
테스트 15 〉	통과 (0.11ms, 76.2MB)
테스트 16 〉	통과 (0.11ms, 75.2MB)
 */
public class Programmers_92335 {
    public int solution(int n, int k) {
        int answer = 0;

        String binaryK = Integer.toString(n, k);
        String[] binaryArray = binaryK.split("0+");

        for(String arr : binaryArray) {
            if (isPrime(Long.parseLong(arr))) {
                answer++;
            }
        }


        return answer;
    }

    public static boolean isPrime(long num) {

        boolean result = true;
        if(num==1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if( num%i == 0) {
                return false;
            }
        }
        return result;
    }
}
