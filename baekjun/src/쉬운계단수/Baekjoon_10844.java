package 쉬운계단수;

public class Baekjoon_10844 {

    static final int MOD = 1000000000;
    public int solution(int num) {
        int sum = 0;
        int[][] dp = new int[101][10];

        for (int i = 0; i < 10; i++)
            dp[1][i] = 1;
        for (int i = 2; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0)
                    dp[i][0] = dp[i - 1][1] % MOD;
                else if (j == 9)
                    dp[i][9] = dp[i - 1][8] % MOD;
                else
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % MOD;
            }
        }
        for (int i = 1; i < 10; i++)
            sum = (sum + dp[num][i]) % MOD;

        return sum;
    }
}
