package 멀리뛰기;

public class Programmers_12914 {
    public long solution(int n) {
        long[] result = new long[n+1];

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        result[0] = 0;
        result[1] = 1L;
        result[2] = 2L;

        for (int i = 3; i <=n; i++) {
            result[i] = (result[i - 1] + result[i - 2]) % 1234567;
        }

        return result[n] % 1234567;
    }
}
