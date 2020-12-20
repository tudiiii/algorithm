package 피보나치수2;


public class Baekjoon_2748 {

    /*
        메모리 : 18372 KB
        시간 : 232ms
    */
    static long[] dp; // 메모이제이션 배열 생성

    static long fibo(int num){
        if(num<=1) return num;

        if(dp[num]>0) return dp[num];

        dp[num] = fibo(num-1) + fibo(num-2);

        return dp[num];

    }

    public long Fibonacci(int num){
        //Scanner sc = new Scanner(System.in);
        dp = new long[num+1];
        //int num = sc.nextInt();

        return fibo(num);
    }


    /* 시간초과 */
    static long fibo2(int num){
        if(num==0) return 0;
        if(num==1) return 1;

        return fibo2(num-1) + fibo2(num-2);
    }

    public long Fibonacci2(int num)   {
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        return fibo2(num);
    }


    /*
        메모리 : 18336 KB
        시간 : 252ms
    */
    public long Fibonacci3(int num)   {
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        long[] answer = new long[num+1];

        answer[0] = 0;
        answer[1] = 1;

        for(int i=2;i<=num;i++){
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer[num];

    }
}
