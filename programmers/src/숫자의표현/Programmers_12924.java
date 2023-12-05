package 숫자의표현;

public class Programmers_12924 {
    public int solution(int n) {
        int count = 1;

        for (int i = 1; i <= n / 2; i++) {
            int sum = i;

            for (int j = i+1 ; j <= n; j++) {
                sum += j;

                if (sum == n) {
                    count++;
                }

                if (sum >= n) {
                    break;
                }
            }
        }

        return count;
    }
}
