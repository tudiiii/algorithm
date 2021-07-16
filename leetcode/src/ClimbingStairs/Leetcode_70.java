package ClimbingStairs;

public class Leetcode_70 {
    public int climbStairs(int n) {
        if(n<4) return n;

        int first = 2;
        int second = 3;

        for(int i=3;i<n;i++){
            int result =  first + second;
            first = second;
            second = result;
        }

        return second;
    }
}
