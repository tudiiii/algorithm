package 가장긴감소하는부분수열;

public class Baekjoon_11722 {
    public int solution(int num, int[] arr){

        int dp[] = new int[num+1];
        dp[1] = 1;

        for(int i=2;i<=num;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }else if ( arr[i] == arr[j]){
                    dp[i] = dp[j];
                }
            }
        }

        int max = 0;

        for(int i=0;i<=num;i++){
            max = Math.max(dp[i],max);
        }

        return max;
    }
}
