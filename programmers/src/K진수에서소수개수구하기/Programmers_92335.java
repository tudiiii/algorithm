package K진수에서소수개수구하기;

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

        for(int i = 2; i <Math.sqrt(num); i++) {
            if( num%i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
